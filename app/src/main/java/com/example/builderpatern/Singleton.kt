package com.example.builderpatern

object Singleton {

    fun getData(): String {

        val builder =
            Builderr().ConfigurationBuilderr().setLatency(0).setUserColor("blue").setSensitivity(true)
                .build()
        return "${builder.latency} ${builder.sensitivity}${builder.userColor}"
    }

}