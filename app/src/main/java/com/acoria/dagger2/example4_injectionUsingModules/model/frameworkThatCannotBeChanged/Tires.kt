package com.acoria.dagger2.example4_injectionUsingModules.model.frameworkThatCannotBeChanged

import android.util.Log

class Tires{

    private val TAG = this::class.java.simpleName
    fun inflate(){
        Log.d(TAG, "##$TAG inflated")
    }
}