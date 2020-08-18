package com.acoria.dagger2.test

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.acoria.dagger2.R
import javax.inject.Inject

class TestActivity : AppCompatActivity() {

    @Inject
    lateinit var car: ICar

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test)

        DaggerIComponent.create().inject(this)

        car.drive()
    }
}