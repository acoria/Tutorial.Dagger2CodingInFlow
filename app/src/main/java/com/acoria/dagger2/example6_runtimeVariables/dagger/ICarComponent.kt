package com.acoria.dagger2.example6_runtimeVariables.dagger

import com.acoria.dagger2.example6_runtimeVariables.RuntimeVariableActivity
import dagger.Component
import javax.inject.Inject

@Component(modules = [DieselEngineModule::class])
interface ICarComponent{
    fun inject(activity: RuntimeVariableActivity)
}