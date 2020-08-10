package com.acoria.dagger2.example1_constructorInjection.model

import android.util.Log
import javax.inject.Inject


class Wheels @Inject constructor(){

    private val TAG = this::class.java.simpleName
    //for testing reasons
    init {
        Log.d(TAG, "##example1: $TAG created")
    }
}