package com.acoria.dagger2.example6_runtimeVariables.model

import android.util.Log
import javax.inject.Inject


class Car @Inject constructor(private val engine: IEngine){

    private val TAG = "Car"

    fun drive(){
        engine.start()
        Log.d(TAG, "##$TAG driving...")
    }
}