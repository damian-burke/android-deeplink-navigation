package com.brainasaservice.deeplinker.main

import android.content.Context
import android.content.Intent
import com.brainasaservice.deeplinkprocessor.DeeplinkProcessor
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class MainDeeplinkProcessor @Inject constructor(
    private val context: Context
) : DeeplinkProcessor {
    override fun matches(deeplink: String): Boolean = deeplink.contains("/main")

    override fun execute(deeplink: String) {
        println("${this::class.java} processing $deeplink")

        context.startActivity(Intent(context, MainActivity::class.java).apply {
            this.flags = Intent.FLAG_ACTIVITY_NEW_TASK
        })
    }

}
