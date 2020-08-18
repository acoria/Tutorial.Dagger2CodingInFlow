package com.acoria.dagger2.example7_runtimeVariablesWithBindInstance.model

import android.util.Log
import javax.inject.Inject


class Car @Inject constructor(private val engine: IEngine){

    private val TAG = "Car"

    fun drive(){
        engine.start()
        Log.d(TAG, "##$TAG driving...")
    }
}