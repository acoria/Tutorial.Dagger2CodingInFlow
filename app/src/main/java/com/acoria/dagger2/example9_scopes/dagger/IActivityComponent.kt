package com.acoria.dagger2.example9_scopes.dagger

import com.acoria.dagger2.example9_scopes.ScopedActivity
import dagger.BindsInstance
import dagger.Component
import javax.inject.Named

@ActivityScope
@Component(dependencies = [IAppComponent::class], modules = [DieselEngineModule::class])
interface IActivityComponent {

    fun inject(activity: ScopedActivity)

    @Component.Builder
    interface Builder {

        @BindsInstance
        fun horsePower(@Named("horse power") horsePower: Int): Builder

        @BindsInstance
        fun engineCapacity(@Named("engine capacity") engineCapacity: Int): Builder

        //by adding the dependency, normally a setter is generated for the app component
        //but since we declared our own builder in which we take over the build process,
        //we have to take care of this ourselves
        fun appComponent(appComponent: IAppComponent): Builder

        fun build(): IActivityComponent
    }
}