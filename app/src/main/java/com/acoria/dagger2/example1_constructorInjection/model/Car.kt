package com.acoria.dagger2.example1_constructorInjection.model

import android.util.Log
import javax.inject.Inject

//Example: Constructor injection
class Car @Inject constructor(
    private var wheels: Wheels,
    private var engine: Engine){

    private val TAG = this::class.java.simpleName

    init {
        Log.d(TAG, "##example1: $TAG created")
    }

    fun drive(){
        Log.d(TAG, "##driving...")
    }
}