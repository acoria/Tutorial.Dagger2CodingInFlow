package com.acoria.dagger2.test

import android.util.Log
import javax.inject.Inject

//Example: Constructor injection
class Car @Inject constructor(private var wheels: Wheels): ICar{

    private val TAG = this::class.java.simpleName

    init {
        Log.d(TAG, "##example2: $TAG created")
    }

    override fun drive(){
        Log.d(TAG, "##driving...")
    }
}