package com.xitij.android.oij.model.login

import com.fasterxml.jackson.annotation.JsonProperty

data class RequestLogin(

        @JsonProperty("Email")
        var email: String? = null,

        @JsonProperty("DeviceId")
        var deviceId: String? = null,

        @JsonProperty("DeviceOS")
        var deviceOS: String? = null,

        @JsonProperty("Password")
        var password: String? = null

)