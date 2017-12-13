package org.unicauca.arch

import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel

/**
 * Created by darfe on 12/12/2017.
 */
class MainViewModel:ViewModel(){

    var msg:MutableLiveData<String> = MutableLiveData()

}