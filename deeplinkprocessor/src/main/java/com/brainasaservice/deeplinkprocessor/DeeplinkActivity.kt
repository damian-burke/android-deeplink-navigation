package com.brainasaservice.deeplinkprocessor

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity

abstract class DeeplinkActivity : AppCompatActivity() {

    abstract fun getDeeplinkHandler(): DeeplinkHandler

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        intent?.let { handleIntent(it) }
    }

    override fun onNewIntent(intent: Intent?) {
        super.onNewIntent(intent)
        intent?.let { handleIntent(it) }
    }

    private fun handleIntent(intent: Intent) {
        intent.data?.toString()?.let {
            getDeeplinkHandler().process(it)
        }
        finish()
    }
}
