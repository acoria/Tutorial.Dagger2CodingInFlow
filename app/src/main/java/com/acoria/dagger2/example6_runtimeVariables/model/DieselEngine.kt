package com.acoria.dagger2.example6_runtimeVariables.model

import android.util.Log
import javax.inject.Inject

class DieselEngine @Inject constructor(private val horsePower: Int) :IEngine{

    private val TAG = "DieselEngine"

//    lateinit var tankSize: String

    override fun start() {
        Log.d(TAG, "##$TAG running with horse power of $horsePower")
    }
}