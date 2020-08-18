package com.acoria.dagger2.example7_runtimeVariablesWithBindInstance.dagger

import com.acoria.dagger2.example6_runtimeVariables.dagger.ICarComponent
import com.acoria.dagger2.example7_runtimeVariablesWithBindInstance.model.DieselEngine
import com.acoria.dagger2.example7_runtimeVariablesWithBindInstance.model.IEngine
import dagger.Binds
import dagger.BindsInstance
import dagger.Component
import dagger.Module

@Module
abstract class DieselEngineModule {

    @Binds
    abstract fun bindsEngine(engine: DieselEngine): IEngine

}