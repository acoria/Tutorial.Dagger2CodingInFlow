package com.acoria.dagger2.example5_interfaces.dagger

import com.acoria.dagger2.example5_interfaces.model.IEngine
import com.acoria.dagger2.example5_interfaces.model.PetrolEngine
import dagger.Binds
import dagger.Module

@Module
abstract class PetrolEngineModule {

    @Binds
    abstract fun bindEngine(engine: PetrolEngine): IEngine
}
