package com.example.builderpatern

class Builderr
    (
    val latency: Int = 0,
    val userColor: String = "",
    val sensitivity: Boolean = true
) {
    inner class ConfigurationBuilderr() {

        var latency: Int = 0
        var userColor: String = ""
        var sensitivity: Boolean = true

        fun setSensitivity(boolean: Boolean): ConfigurationBuilderr {
            this.sensitivity = boolean
            return this
        }

        fun setUserColor(color: String): ConfigurationBuilderr {
            this.userColor = color
            return this
        }

        fun setLatency(value: Int): ConfigurationBuilderr {
            this.latency = value
            return this
        }

        fun build(): Builderr = Builderr(
            latency = latency,
            userColor = userColor,
            sensitivity = sensitivity
        )
    }
}