package com.acoria.dagger2.example3_orderOfInjection.model

import android.util.Log
import javax.inject.Inject

//Dagger uses the following order
//1) constructor
//2) fields
//3) methods

// 1) Constructor injection for Engine
class Car @Inject constructor(
    private var engine: Engine){

    private val TAG = this::class.java.simpleName

    // 2) Field injection
    @Inject
    lateinit var wheels: Wheels

    init {
        Log.d(TAG, "##$TAG created")
    }

    fun drive(){
        Log.d(TAG, "##driving...")
    }

    // 3) Method injection for RemoteCarKey
    @Inject
    fun enableRemoteKey(remoteCarKey: RemoteCarKey){
        //Einziger Usecase für Method injection: Wenn eine Instanz selbst an eine Dependency
        //übergeben werden muss. Im Constructor wäre dies nicht möglich, da das Objekt noch nicht
        //komplett aufgebaut ist
        remoteCarKey.setListener(this)
    }
}