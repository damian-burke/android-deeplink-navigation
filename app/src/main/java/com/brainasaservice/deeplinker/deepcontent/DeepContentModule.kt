package com.brainasaservice.deeplinker.deepcontent

import com.brainasaservice.deeplinkprocessor.DeeplinkProcessor
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoSet

@Module
interface DeepContentModule {
    @Binds
    @IntoSet
    fun bindsDeepContentDeeplinkProcessorIntoSet(processor: DeepContentDeeplinkProcessor)
            : DeeplinkProcessor
}
