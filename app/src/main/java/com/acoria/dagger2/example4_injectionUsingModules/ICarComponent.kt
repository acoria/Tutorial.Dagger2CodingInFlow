package com.acoria.dagger2.example4_injectionUsingModules

import dagger.Component

@Component (modules = [WheelsModule::class])
interface ICarComponent {

    fun inject(activity: InjectionUsingModulesActivity)

}