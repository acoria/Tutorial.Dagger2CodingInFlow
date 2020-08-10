package com.acoria.dagger2.example1_constructorInjection

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.acoria.dagger2.R
import com.acoria.dagger2.example1_constructorInjection.model.Car

class ActivityCarComponentWithGetter : AppCompatActivity() {

    private lateinit var car: Car

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val component = DaggerICarComponentWithGetter.create()
        car = component.getCar()
        println("##getter:")
        car.drive()
    }
}