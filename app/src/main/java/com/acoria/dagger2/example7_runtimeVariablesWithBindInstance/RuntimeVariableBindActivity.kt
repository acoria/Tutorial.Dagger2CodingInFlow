package com.acoria.dagger2.example7_runtimeVariablesWithBindInstance

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.acoria.dagger2.R
import com.acoria.dagger2.example7_runtimeVariablesWithBindInstance.dagger.DaggerICarComponent
import com.acoria.dagger2.example7_runtimeVariablesWithBindInstance.dagger.DieselEngineModule
import com.acoria.dagger2.example7_runtimeVariablesWithBindInstance.model.Car
import javax.inject.Inject
import javax.inject.Named

class RuntimeVariableBindActivity : AppCompatActivity() {

    @Inject
    lateinit var car: Car

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_runtime_variable_bind)

        DaggerICarComponent.builder()
            .horsePower( 150)
            .engineCapacity(1400)
            .build()
            .inject(this)

        car.drive()

    }
}