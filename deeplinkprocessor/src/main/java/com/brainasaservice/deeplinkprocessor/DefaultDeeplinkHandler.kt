package com.brainasaservice.deeplinkprocessor

class DefaultDeeplinkHandler constructor(
        private val processors: Set<@JvmSuppressWildcards DeeplinkProcessor>
): DeeplinkHandler {
    override fun process(deeplink: String): Boolean {
        processors.forEach {
            if (it.matches(deeplink)) {
                it.execute(deeplink)
                return true
            }
        }
        return false
    }
}
