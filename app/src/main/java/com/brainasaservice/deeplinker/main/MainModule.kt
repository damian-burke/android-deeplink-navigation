package com.brainasaservice.deeplinker.main

import com.brainasaservice.deeplinkprocessor.DeeplinkProcessor
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoSet

@Module
interface MainModule {
    @Binds
    @IntoSet
    fun bindsMainDeeplinkProcessorIntoSet(
        processor: MainDeeplinkProcessor
    ): DeeplinkProcessor
}
