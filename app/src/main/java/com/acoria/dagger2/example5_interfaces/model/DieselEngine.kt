package com.acoria.dagger2.example5_interfaces.model

import android.util.Log
import javax.inject.Inject

class DieselEngine @Inject constructor(): IEngine {
    private val TAG = "DieselEngine"
    
    override fun start() {
        Log.d(TAG, "##$TAG running")
    }
}