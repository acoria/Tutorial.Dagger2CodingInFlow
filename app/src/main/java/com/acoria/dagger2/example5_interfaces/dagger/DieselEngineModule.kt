package com.acoria.dagger2.example5_interfaces.dagger

import com.acoria.dagger2.example5_interfaces.model.DieselEngine
import com.acoria.dagger2.example5_interfaces.model.IEngine
import dagger.Binds
import dagger.Module

@Module
abstract class DieselEngineModule {

    @Binds
    abstract fun bindEngine(engine: DieselEngine) : IEngine
}