package com.acoria.dagger2.example3_orderOfInjection

import dagger.Component

@Component
interface IComponentForOrderOfInjection {

    fun inject(activityOrderOfInjection: OrderOfInjectionActivity)

}