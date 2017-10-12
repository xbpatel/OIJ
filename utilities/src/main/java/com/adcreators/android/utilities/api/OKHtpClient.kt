package com.adcreators.android.utilities.api

import android.util.Log
import com.fasterxml.jackson.core.type.TypeReference
import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.module.kotlin.jacksonObjectMapper

import com.squareup.okhttp.*
import java.io.IOException
import java.io.ObjectInput
import kotlin.reflect.jvm.internal.impl.load.kotlin.JvmType
import com.fasterxml.jackson.module.kotlin.*
import android.R.attr.configure
import com.fasterxml.jackson.core.JsonParser
import com.fasterxml.jackson.databind.ObjectMapper
import org.json.JSONObject
import com.squareup.okhttp.RequestBody




/**
 * Created by excellent-3 on 25/07/17.
 */
class OKHtpClient : RestClient {

     companion object {

          var JSON : MediaType = MediaType.parse("application/json; charset=utf-8") !!
     }

     override fun request(url : String , httpMethod : String , header : Map<String , String>? , jsonBody : String? , isBackground : Boolean , completion : (Any?) -> Unit) {


          val httpClient = OkHttpClient()

          val requestBody : RequestBody = RequestBody.create(JSON !! , jsonBody.toString() ?: "")
          val request : Request = Request.Builder()
                  .url(url)
                  .addHeader("content-type" , "application/json; charset=utf-8")
                  .post(requestBody)
                  .build()

          httpClient.newCall(request).enqueue(object : Callback {

               override fun onFailure(request : Request? , e : IOException?) {
                    Log.e("OnFailure" , "OKHtpClient")
                    completion(OKHtpResult(null , e))
               }

               override fun onResponse(response : Response?) {
                   // Log.e("OnSuccess" , response!!.body().string())

                    if (response?.isSuccessful == true) {

                         if (response != null && response.body() != null) {

                              var res : String = response!!.body().string()
                              Log.e("OnSuccess" , res)
                              val objectMapper = ObjectMapper()

                              var map  = objectMapper.readValue<JsonNode>(res)

                              if (map.get("ResponseCode").asInt() == 0) {
                                   completion(OKHtpResult(null , IOException()))
                              } else {
                                   completion(OKHtpResult(res , null))
                              }
                         }

                    } else {
                         completion(OKHtpResult(null , IOException()))
                    }

               }


          })

     }


}