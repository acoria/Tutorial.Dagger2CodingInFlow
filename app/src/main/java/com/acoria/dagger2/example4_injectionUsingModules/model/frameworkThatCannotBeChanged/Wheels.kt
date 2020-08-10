package com.acoria.dagger2.example4_injectionUsingModules.model.frameworkThatCannotBeChanged

import android.util.Log
import javax.inject.Inject


class Wheels (private val tires: Tires, private val rims: Rims){

    private val TAG = this::class.java.simpleName
    init {
        Log.d(TAG, "##example4: $TAG created")
    }
}