package com.acoria.dagger2.example3_orderOfInjection.model

import android.util.Log
import javax.inject.Inject

class Engine @Inject constructor(){

    private val TAG = this::class.java.simpleName

    //just for testing reasons
    init {
        Log.d(TAG, "##$TAG created")
    }
}