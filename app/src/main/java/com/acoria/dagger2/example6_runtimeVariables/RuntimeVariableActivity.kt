package com.acoria.dagger2.example6_runtimeVariables

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.acoria.dagger2.R
import com.acoria.dagger2.example6_runtimeVariables.dagger.DaggerICarComponent
import com.acoria.dagger2.example6_runtimeVariables.dagger.DieselEngineModule
import com.acoria.dagger2.example6_runtimeVariables.model.Car
import javax.inject.Inject

class RuntimeVariableActivity : AppCompatActivity() {

    @Inject
    lateinit var car: Car

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_runtime_variable)

        //die create-Methode ist nur verfügbar, wenn zum Erzeugen der Component keine
        //Parameter nötig sind
//        DaggerICarComponent.create().inject(this)

        //stattdessen muss ein Builder verwendet werden
        //in Android ist ein häufiges Beispiel hierfür der Application Context, der erst zur
        //Laufzeit verfügbar ist
        DaggerICarComponent.builder()
            .dieselEngineModule(DieselEngineModule(100))
            .build()
            .inject(this)

        car.drive()
    }
}