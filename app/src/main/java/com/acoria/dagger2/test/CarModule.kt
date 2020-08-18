package com.acoria.dagger2.test

import dagger.Binds
import dagger.Module

@Module
abstract class CarModule {

    @Binds
    abstract fun bindCar(car: Car): ICar
}