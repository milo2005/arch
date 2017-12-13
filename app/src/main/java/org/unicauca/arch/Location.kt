package org.unicauca.arch

import android.arch.lifecycle.Lifecycle
import android.arch.lifecycle.LifecycleObserver
import android.arch.lifecycle.LifecycleOwner
import android.arch.lifecycle.OnLifecycleEvent
import android.util.Log

class Location(owner:LifecycleOwner):LifecycleObserver{

    init{
        owner.lifecycle.addObserver(this)
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    fun initLocation(){
        Log.i("Location","Inicio de GPS")
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    fun stopLocation(){
        Log.i("Location", "Fin de GPS")
    }
}