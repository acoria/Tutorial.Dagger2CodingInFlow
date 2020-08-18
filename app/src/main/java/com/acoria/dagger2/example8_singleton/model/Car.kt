package com.acoria.dagger2.example8_singleton.model

import android.util.Log
import javax.inject.Inject


class Car @Inject constructor(private val driver: Driver, private val engine: IEngine){

    private val TAG = "Car"

    fun drive(){
        engine.start()
        Log.d(TAG, "##$TAG $driver driving $this")
    }
}