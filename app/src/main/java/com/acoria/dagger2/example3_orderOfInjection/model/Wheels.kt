package com.acoria.dagger2.example3_orderOfInjection.model

import android.util.Log
import javax.inject.Inject


class Wheels @Inject constructor(){

    private val TAG = this::class.java.simpleName
    //for testing reasons
    init {
        Log.d(TAG, "##$TAG created")
    }
}