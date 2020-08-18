package com.acoria.dagger2.example9_scopes.dagger

import com.acoria.dagger2.example9_scopes.model.Driver
import dagger.Module
import dagger.Provides

@Module
object DriverModule {

    @Provides
    @AppScope
    fun provideDriver(): Driver{
        return Driver()
    }

}