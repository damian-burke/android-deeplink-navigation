package com.brainasaservice.deeplinker.deeplink

import com.brainasaservice.deeplinker.ui.DeeplinkApp
import com.brainasaservice.deeplinkprocessor.DeeplinkActivity
import com.brainasaservice.deeplinkprocessor.DeeplinkHandler

class MyDeeplinkActivity : DeeplinkActivity() {
    override fun getDeeplinkHandler(): DeeplinkHandler =
        (applicationContext as DeeplinkApp).component.deeplinkHandler()
}
