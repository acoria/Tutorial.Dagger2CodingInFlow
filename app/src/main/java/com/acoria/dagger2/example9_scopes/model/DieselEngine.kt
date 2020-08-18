package com.acoria.dagger2.example9_scopes.model

import android.util.Log
import javax.inject.Inject
import javax.inject.Named

class DieselEngine @Inject constructor(
    @Named("horse power") private val horsePower: Int,
    @Named("engine capacity") private val engineCapacity: Int
) : IEngine {

    private val TAG = "DieselEngine"

    override fun start() {
        Log.d(
            TAG,
            "##$TAG running with horse power of $horsePower and engine capacity of $engineCapacity"
        )
    }
}