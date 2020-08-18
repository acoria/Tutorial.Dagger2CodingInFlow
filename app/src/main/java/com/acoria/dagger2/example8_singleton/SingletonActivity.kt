package com.acoria.dagger2.example8_singleton

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.acoria.dagger2.R
import com.acoria.dagger2.example8_singleton.dagger.DaggerICarComponent
import com.acoria.dagger2.example8_singleton.model.Car
import javax.inject.Inject

class SingletonActivity : AppCompatActivity() {

    @Inject
    lateinit var car1: Car
    @Inject
    lateinit var car2: Car

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_singleton)

        DaggerICarComponent.builder()
            .horsePower( 150)
            .engineCapacity(1400)
            .build()
            .inject(this)

        car1.drive()
        car2.drive()

    }
}