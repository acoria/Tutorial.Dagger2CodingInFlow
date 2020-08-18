package com.acoria.dagger2.example9_scopes

import android.app.Application
import com.acoria.dagger2.example9_scopes.dagger.DaggerIAppComponent
import com.acoria.dagger2.example9_scopes.dagger.IAppComponent

class CustomApplication: Application() {

    val appComponent: IAppComponent = DaggerIAppComponent.create()

}