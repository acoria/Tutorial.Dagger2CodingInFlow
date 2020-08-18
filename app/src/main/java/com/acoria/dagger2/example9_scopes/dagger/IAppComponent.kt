package com.acoria.dagger2.example9_scopes.dagger

import com.acoria.dagger2.example9_scopes.ScopedActivity
import com.acoria.dagger2.example9_scopes.model.Driver
import dagger.Binds
import dagger.BindsInstance
import dagger.Component
import javax.inject.Named
import javax.inject.Singleton

@AppScope
@Component(modules = [DriverModule::class])
interface IAppComponent {

    fun getDriver(): Driver

}