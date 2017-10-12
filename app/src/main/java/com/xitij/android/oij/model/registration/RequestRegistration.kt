package com.xitij.android.oij.model.registration

import java.util.HashMap
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonPropertyOrder

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder("api_key" , "first_name" , "last_name" , "country_code" , "mobile_num" , "email_id")
class RequestRegistration {

     @JsonProperty("api_key")
     @get:JsonProperty("api_key")
     @set:JsonProperty("api_key")
     var apiKey : String? = null
     @JsonProperty("first_name")
     @get:JsonProperty("first_name")
     @set:JsonProperty("first_name")
     var firstName : String? = null
     @JsonProperty("last_name")
     @get:JsonProperty("last_name")
     @set:JsonProperty("last_name")
     var lastName : String? = null
     @JsonProperty("country_code")
     @get:JsonProperty("country_code")
     @set:JsonProperty("country_code")
     var countryCode : String? = null
     @JsonProperty("mobile_num")
     @get:JsonProperty("mobile_num")
     @set:JsonProperty("mobile_num")
     var mobileNum : String? = null
     @JsonProperty("email_id")
     @get:JsonProperty("email_id")
     @set:JsonProperty("email_id")
     var emailId : String? = null
     @JsonIgnore
     private val additionalProperties = HashMap<String , Any>()

     @JsonAnyGetter
     fun getAdditionalProperties() : Map<String , Any> {
          return this.additionalProperties
     }

     @JsonAnySetter
     fun setAdditionalProperty(name : String , value : Any) {
          this.additionalProperties.put(name , value)
     }

}