package com.acoria.dagger2.example3_orderOfInjection.model

import android.util.Log
import javax.inject.Inject


class RemoteCarKey @Inject constructor(){

    private val TAG = this::class.java.simpleName

    fun setListener(car: Car) {
        Log.d(TAG, "##$TAG added to car")
    }
}