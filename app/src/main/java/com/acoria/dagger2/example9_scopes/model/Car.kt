package com.acoria.dagger2.example9_scopes.model

import android.util.Log
import com.acoria.dagger2.example9_scopes.dagger.ActivityScope
import javax.inject.Inject

@ActivityScope
class Car @Inject constructor(private val driver: Driver, private val engine: IEngine){

    private val TAG = "Car"

    fun drive(){
        engine.start()
        Log.d(TAG, "##$TAG $driver driving $this")
    }
}