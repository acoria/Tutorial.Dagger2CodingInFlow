package com.acoria.dagger2.example9_scopes

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.acoria.dagger2.R
import com.acoria.dagger2.example9_scopes.dagger.DaggerIActivityComponent
import com.acoria.dagger2.example9_scopes.model.Car
import javax.inject.Inject

class ScopedActivity : AppCompatActivity() {

    @Inject
    lateinit var car1: Car

    @Inject
    lateinit var car2: Car

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_scoped)

        DaggerIActivityComponent.builder()
            .appComponent((application as CustomApplication).appComponent)
            .horsePower(200)
            .engineCapacity(2000)
            .build()
            .inject(this)

        car1.drive()
        car2.drive()
    }
}