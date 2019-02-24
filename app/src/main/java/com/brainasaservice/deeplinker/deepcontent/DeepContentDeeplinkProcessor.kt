package com.brainasaservice.deeplinker.deepcontent

import android.content.Context
import android.content.Intent
import com.brainasaservice.deeplinkprocessor.DeeplinkProcessor
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class DeepContentDeeplinkProcessor @Inject constructor(
        private val context: Context
) : DeeplinkProcessor {
    override fun matches(deeplink: String): Boolean = deeplink.contains("deep/content")

    override fun execute(deeplink: String) {
        context.startActivity(Intent(context, DeepContentActivity::class.java))
    }
}
