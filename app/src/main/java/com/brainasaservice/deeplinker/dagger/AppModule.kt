package com.brainasaservice.deeplinker.dagger

import android.content.Context
import com.brainasaservice.deeplinkprocessor.DefaultDeeplinkHandler
import com.brainasaservice.deeplinker.ui.DeeplinkApp
import com.brainasaservice.deeplinkprocessor.DeeplinkHandler
import com.brainasaservice.deeplinkprocessor.DeeplinkProcessor
import dagger.Binds
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class AppModule(
        private val app: DeeplinkApp
) {
    @Provides
    @Singleton
    fun providesContext(): Context = app

    @Provides
    @Singleton
    fun providesDefaultDeeplinkHandler(
            processors: Set<@JvmSuppressWildcards DeeplinkProcessor>
    ): DeeplinkHandler = DefaultDeeplinkHandler(processors)
}
