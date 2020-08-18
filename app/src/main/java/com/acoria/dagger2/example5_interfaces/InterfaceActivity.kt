package com.acoria.dagger2.example5_interfaces

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.acoria.dagger2.R
import com.acoria.dagger2.example5_interfaces.dagger.DaggerICarComponent
import com.acoria.dagger2.example5_interfaces.model.Car
import javax.inject.Inject

class InterfaceActivity : AppCompatActivity() {

    @Inject
    lateinit var car: Car

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_interface)

        DaggerICarComponent.create().inject(this)

        car.drive()
    }
}