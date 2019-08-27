package com.brainasaservice.deeplinker.ui

import android.app.Application
import com.brainasaservice.deeplinker.dagger.AppComponent
import com.brainasaservice.deeplinker.dagger.AppModule
import com.brainasaservice.deeplinker.dagger.DaggerAppComponent

class DeeplinkApp : Application() {
    val component: AppComponent by lazy {
        DaggerAppComponent
            .builder()
            .appModule(AppModule(this))
            .build()
    }

    override fun onCreate() {
        super.onCreate()

        component.inject(this)
    }
}
