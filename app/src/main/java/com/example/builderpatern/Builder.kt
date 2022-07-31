package com.example.builderpatern


data class Configuration(
    val latency:Int,
    val userColor: String,
    val sensitivity: Boolean
)
    class ConfigurationBuilder() {
        var latency :Int = 300
        var userColor : String = "blue"
        var sensitivity: Boolean = true

        fun setSensitivity(boolean :Boolean ):ConfigurationBuilder {
            this.sensitivity = boolean
            return this
        }

        fun setUserColor(color :String ):ConfigurationBuilder {
            this.userColor = color
            return this
        }

        fun setLatency(value :Int ):ConfigurationBuilder {
            this.latency = value
            return this
        }

        fun build(): Configuration = Configuration(
            latency = latency ,
            userColor = userColor,
            sensitivity = sensitivity
        )
    }



