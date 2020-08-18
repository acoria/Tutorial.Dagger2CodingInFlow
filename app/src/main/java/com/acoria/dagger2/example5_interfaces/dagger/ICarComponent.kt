package com.acoria.dagger2.example5_interfaces.dagger

import com.acoria.dagger2.example5_interfaces.InterfaceActivity
import dagger.Component

@Component(modules = [PetrolEngineModule::class])
interface ICarComponent {
    fun inject(activity: InterfaceActivity)
}