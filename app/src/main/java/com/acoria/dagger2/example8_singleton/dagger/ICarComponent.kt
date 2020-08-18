package com.acoria.dagger2.example8_singleton.dagger

import com.acoria.dagger2.example8_singleton.SingletonActivity
import dagger.BindsInstance
import dagger.Component
import javax.inject.Named
import javax.inject.Singleton

@Singleton
@Component(modules = [DieselEngineModule::class])
interface ICarComponent {

    fun inject(activity: SingletonActivity)

    //Builder für die Component überschreiben, um eigene Methoden zu definieren, um Attribute zu
    //binden
    //BindsInstance sollte immer Module-Constructor-Injection (mittels Provides) vorgezogen werden,
    //da Dagger dadurch keine Module-Instanz erzeugen muss
    @Component.Builder
    interface Builder {

        //Named: wenn zwei typgleiche, aber unterschiedliche Instanzen benötigt werden, können diese
        //mit "named" unterschieden werden (oder eigene Annotations definiert werden)
        @BindsInstance
        fun horsePower(@Named("horse power") horsePower: Int): Builder

        @BindsInstance
        fun engineCapacity(@Named("engine capacity") engineCapacity: Int): Builder

        fun build(): ICarComponent
    }
}