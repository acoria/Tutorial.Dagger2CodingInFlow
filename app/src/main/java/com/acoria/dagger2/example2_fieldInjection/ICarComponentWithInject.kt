package com.acoria.dagger2.example2_fieldInjection

import dagger.Component

@Component
interface ICarComponentWithInject{

    fun inject(activityCarComponentWithInject: ActivityCarComponentWithInject)

}