package com.brainasaservice.deeplinker.deeplink

import com.brainasaservice.deeplinker.ui.DeeplinkApp

class MyDeeplinkActivity : com.brainasaservice.deeplinkprocessor.DeeplinkActivity() {
    override fun getDeeplinkHandler(): com.brainasaservice.deeplinkprocessor.DeeplinkHandler = (applicationContext as DeeplinkApp).component.deeplinkHandler()
}
