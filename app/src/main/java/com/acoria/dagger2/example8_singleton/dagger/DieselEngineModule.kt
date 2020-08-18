package com.acoria.dagger2.example8_singleton.dagger

import com.acoria.dagger2.example8_singleton.model.DieselEngine
import com.acoria.dagger2.example8_singleton.model.IEngine
import dagger.Binds
import dagger.Module

@Module
abstract class DieselEngineModule {

    //@Singleton: könnte hier verwendet werden, allerdings ist dies eher ein Implementierungsdetail
    //weshalb eher der Konstruktor von DieselEngine mit @Singleton annotiert werden sollte
    @Binds
    abstract fun bindsEngine(engine: DieselEngine): IEngine

}