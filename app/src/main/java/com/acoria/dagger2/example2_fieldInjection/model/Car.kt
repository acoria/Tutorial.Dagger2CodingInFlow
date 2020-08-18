package com.acoria.dagger2.example2_fieldInjection.model

import android.util.Log
import javax.inject.Inject

//Example: Constructor injection
class Car @Inject constructor(
    private var wheels: Wheels,
    private var engine: Engine){

    private val TAG = this::class.java.simpleName

    init {
        Log.d(TAG, "##example2: $TAG created")
    }

    fun drive(){
        Log.d(TAG, "##driving...")
    }

    //Method injection:
    //Use case: when an injected instance is needed somewhere else after it was created.
    //By annotating the method, it is called after the constructor for the car was called
    @Inject
    fun enableRemoteKey(remoteCarKey: RemoteCarKey){
        remoteCarKey.setListener(this)
    }
}