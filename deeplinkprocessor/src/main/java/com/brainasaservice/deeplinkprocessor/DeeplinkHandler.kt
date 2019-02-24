package com.brainasaservice.deeplinkprocessor

interface DeeplinkHandler {
    fun process(deeplink: String): Boolean
}
