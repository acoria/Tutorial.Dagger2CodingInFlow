package com.acoria.dagger2.example2_fieldInjection.model

import android.util.Log
import javax.inject.Inject

class Engine @Inject constructor(){

    private val TAG = this::class.java.simpleName

    //just for testing reasons
    init {
        Log.d(TAG, "##example2: $TAG created")
    }
}