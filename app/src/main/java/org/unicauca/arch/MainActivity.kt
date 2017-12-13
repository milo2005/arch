package org.unicauca.arch

import android.arch.lifecycle.Observer
import android.arch.lifecycle.ViewModelProviders
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import org.unicauca.arch.util.getViewModel

class MainActivity : AppCompatActivity() {

    val viewModel:MainViewModel by lazy { getViewModel<MainViewModel>() }
    val location:Location = Location(this)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnChange.setOnClickListener{
            viewModel.msg.value = "Hola"
        }

        viewModel.msg.observe(this, Observer {
            txt.text = it
        })

    }
}
