package com.acoria.dagger2.example6_runtimeVariables.dagger

import com.acoria.dagger2.example6_runtimeVariables.model.DieselEngine
import com.acoria.dagger2.example6_runtimeVariables.model.IEngine
import dagger.Binds
import dagger.Module
import dagger.Provides
import javax.inject.Inject

@Module
class DieselEngineModule(private val horsePower: Int) {

    @Provides
    fun providesEngine(): IEngine{
        return DieselEngine(horsePower)
    }

}