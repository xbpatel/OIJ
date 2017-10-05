package com.xitij.android.oij.model

import com.fasterxml.jackson.annotation.JsonProperty

/**
 * Created by excellent-3 on 05/10/17.
 */
data class ResponseLogin(

        @JsonProperty("ResponseCode")
        val responseCode: Int? = null,

        @JsonProperty("Data")
        val data: UserData? = null,

        @JsonProperty("ResponseMessage")
        val responseMessage: String? = null)