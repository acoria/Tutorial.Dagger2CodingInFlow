package com.acoria.dagger2.example4_injectionUsingModules

import com.acoria.dagger2.example4_injectionUsingModules.model.frameworkThatCannotBeChanged.Rims
import com.acoria.dagger2.example4_injectionUsingModules.model.frameworkThatCannotBeChanged.Tires
import com.acoria.dagger2.example4_injectionUsingModules.model.frameworkThatCannotBeChanged.Wheels
import dagger.Module
import dagger.Provides

@Module
class WheelsModule {

    //use provides when you cannot access the constructor to use constructor injection
    //because it is a 3rd party lib
    @Provides
    fun provideRims(): Rims {
        return Rims()
    }

    //use provides when you have to do some configuration on the object after creating
    @Provides
    fun provideTires(): Tires{
        val tires = Tires()
        tires.inflate()
        return tires
    }

    @Provides
    fun provideWheels(tires: Tires, rims: Rims): Wheels{
        return Wheels(tires, rims)
    }
}