package com.acoria.dagger2.example1_constructorInjection

import com.acoria.dagger2.example1_constructorInjection.model.Car
import dagger.Component

@Component
interface ICarComponentWithGetter {

    fun getCar(): Car

}