package com.acoria.dagger2.example2_fieldInjection

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.acoria.dagger2.R
import com.acoria.dagger2.example2_fieldInjection.module.Car
import javax.inject.Inject

/*Field injection:
- By calling component.inject(this), all fields that are annotated with @Inject are filled
  by the component
- Field injection is used when the constructor cannot be adjusted (e.g. 3rd party libraries)
  but has the downside that the field has to be public. For constructor injection, the
  field can be private.
  Main rule:
    Use constructor injection wherever possible.
    Field injections are for framework components that are not instantiated by yourself.
* */


class ActivityCarComponentWithInject : AppCompatActivity() {

    private val TAG = this::class.java.simpleName

    @Inject
    lateinit var car: Car

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_car_component_with_inject)

        Log.d(TAG,"##inject:")

        //Component-Name setzt sich zusammen aus: "Dagger" + <Interfacename der Component>
        val component = DaggerICarComponentWithInject.create()
        //pass the activity/fragment to the component and ask it to inject all annotated objects
        component.inject(this)

        car.drive()

    }
}