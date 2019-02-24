package com.brainasaservice.deeplinker.dagger

import com.brainasaservice.deeplinker.deepcontent.DeepContentModule
import com.brainasaservice.deeplinker.deepcustom.DeepCustomModule
import com.brainasaservice.deeplinkprocessor.DeeplinkActivity
import com.brainasaservice.deeplinkprocessor.DeeplinkHandler
import com.brainasaservice.deeplinker.main.MainActivity
import com.brainasaservice.deeplinker.main.MainModule
import com.brainasaservice.deeplinker.ui.DeeplinkApp
import dagger.Component
import javax.inject.Singleton

@Singleton

@Component(
        modules = [
            AppModule::class,
            DeepContentModule::class,
            MainModule::class,
            DeepCustomModule::class
        ]
)
interface AppComponent {
    fun inject(app: DeeplinkApp)

    fun inject(app: MainActivity)

    fun inject(deeplinkActivity: com.brainasaservice.deeplinkprocessor.DeeplinkActivity)

    fun deeplinkHandler(): com.brainasaservice.deeplinkprocessor.DeeplinkHandler
}
