package com.acoria.dagger2.example9_scopes.dagger


import com.acoria.dagger2.example9_scopes.model.DieselEngine
import com.acoria.dagger2.example9_scopes.model.IEngine
import dagger.Binds
import dagger.Module

@Module
abstract class DieselEngineModule {

    @Binds
    abstract fun bindsEngine(engine: DieselEngine): IEngine

}