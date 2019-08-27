package com.brainasaservice.deeplinker.deepcustom

import android.content.Context
import android.content.Intent
import android.content.Intent.FLAG_ACTIVITY_NEW_TASK
import com.brainasaservice.deeplinkprocessor.DeeplinkProcessor
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class DeepCustomDeeplinkProcessor @Inject constructor(
    private val context: Context
) : DeeplinkProcessor {

    override fun matches(deeplink: String): Boolean {
        return deeplink.contains("deep/custom/")
    }

    override fun execute(deeplink: String) {
        val name = deeplink.removePrefix("deep://deep/custom/").split('/').getOrNull(0) ?: "Unknown"
        val model = CustomDeeplinkModel(name)

        context.startActivity(Intent(context, DeepCustomActivity::class.java).apply {
            this.flags = FLAG_ACTIVITY_NEW_TASK
            putExtra(DeeplinkProcessor.EXTRA_KEY, model)
        })
    }
}

