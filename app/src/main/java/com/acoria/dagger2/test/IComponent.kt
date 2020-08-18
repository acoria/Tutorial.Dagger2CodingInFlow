package com.acoria.dagger2.test

import dagger.Component

@Component(modules = [CarModule::class])
interface IComponent {
    fun inject(activity: TestActivity)
}