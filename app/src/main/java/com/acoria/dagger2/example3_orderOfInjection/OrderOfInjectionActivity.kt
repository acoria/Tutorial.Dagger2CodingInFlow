package com.acoria.dagger2.example3_orderOfInjection

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.acoria.dagger2.R
import com.acoria.dagger2.example3_orderOfInjection.model.Car
import javax.inject.Inject

class OrderOfInjectionActivity : AppCompatActivity() {

    @Inject
    lateinit var car: Car

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_order_of_injection)

        //Erzeugt eine Component und injected die Activity
        //Dadurch werden alle Variablen, die mit "Inject" annotated sind, erzeugt
        //Component-Name setzt sich zusammen aus: "Dagger" + <Interfacename der Component>

        //Field & Method injection werden nur durch eine Constructor injection getriggert
        //Deshalb ist hier, um Car zu injecten, ein Aufruf über die Component nötig, da der
        //Constructor nicht angepasst werden kann (Android-Framework)
        DaggerIComponentForOrderOfInjection.create().inject(this)

        car.drive()

    }
}