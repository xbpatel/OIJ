package com.xitij.android.oij.viewmodel

import android.content.Context
import android.text.TextUtils
import android.util.Log
import com.adcreators.android.customarchitecturekotlin.React
import com.adcreators.android.utilities.helpers.AppStatus
import com.xitij.android.oij.model.login.RequestLogin
import com.xitij.android.oij.service.LoginService
import com.xitij.android.oij.worker.login.LoginWorker

/**
 * Created by excellent-3 on 12/10/17.
 */
class LoginViewModel{


     internal var name : String = ""
     internal var password : String = ""

     //reactive properties
     var isNetworkAvailable : React<Boolean> = React(true)
     var isValidate : React<Boolean> = React(false)
     var inValidCredentials : React<Boolean> = React(true)

     internal var login : RequestLogin? = null
     var loginWorker : LoginWorker? = null
     var context : Context? = null


     private fun getName() : String = name
     private fun getPassword() : String = password


     constructor(ctx : Context , loginRequest : RequestLogin?) {
          this.login = loginRequest
          this.context = ctx
     }


     internal fun validateCredentials(isBackground : Boolean , completionHandler : (Boolean) -> Unit) {

          this.name = login?.email !!
          this.password = login?.password !!

          if (TextUtils.isEmpty(name) && TextUtils.isEmpty(password)) {
               Log.e("Validation" , "False")
               this.isValidate.writeValue = false
          } else {
               Log.e("Validation" , "True")
               this.isValidate.writeValue = true
          }
          this.isValidate.writeValue = true

          Log.e("Value of isValidate " , "" + this.isValidate.readValue)

          if (this.isValidate.readValue == true) {

               Log.e("Here is success" , "Call service")

               loginWorker = LoginWorker(LoginService())
               loginWorker?.loginWorkerInterface?.processLogin(this.name , this.password , false , completionHandler = {

                    if (it == null) {
                         Log.e("Response" , "Response Failure ")
                         this.inValidCredentials.writeValue = true
                         completionHandler(false)
                    } else {
                         // Log.e("HEHE" , jacksonObjectMapper().writeValueAsString(it))
                         completionHandler(true)
                    }
               })

          }


     }

     internal fun doLogin(isBackground : Boolean , completionHandler : (Boolean) -> Unit) {

          Log.e("In doLogin" , "Here")
          if (AppStatus.isOnline(context !!) == false) {
               Log.e("In Online" , "False")
               this.isNetworkAvailable.writeValue = false
               completionHandler(false)

          } else {
               Log.e("In Online" , "True")
               validateCredentials(isBackground , {})

          }

     }


}

