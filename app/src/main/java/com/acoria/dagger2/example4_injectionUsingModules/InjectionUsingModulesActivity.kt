package com.acoria.dagger2.example4_injectionUsingModules

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.acoria.dagger2.R
import com.acoria.dagger2.example4_injectionUsingModules.model.Car
import javax.inject.Inject

class InjectionUsingModulesActivity : AppCompatActivity() {

    @Inject
    lateinit var car: Car

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_injection_using_modules)

        DaggerICarComponent.create().inject(this)

        car.drive()
    }
}