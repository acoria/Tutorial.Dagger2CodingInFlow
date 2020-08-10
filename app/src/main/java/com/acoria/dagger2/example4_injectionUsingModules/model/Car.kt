package com.acoria.dagger2.example4_injectionUsingModules.model

import android.util.Log
import com.acoria.dagger2.example4_injectionUsingModules.model.frameworkThatCannotBeChanged.Wheels
import javax.inject.Inject

//Example: Constructor injection
class Car @Inject constructor(
    private var wheels: Wheels
) {

    private val TAG = this::class.java.simpleName

    init {
        Log.d(TAG, "##example4: $TAG created")
    }

    fun drive() {
        Log.d(TAG, "##driving...")
    }
}