package com.xitij.android.oij.service

import com.adcreators.android.utilities.persistence.UtilConstants
import com.xitij.android.oij.worker.LoginCompletionHandler
import com.xitij.android.oij.worker.LoginWorkerInterface

/**
 * Created by excellent-3 on 05/10/17.
 */
class LoginService : LoginWorkerInterface {

     val url : String = "http://trademarktransport.com.au/testing/backend/web/index.php?r=mobile/login"
     val util = UtilConstants


     override fun processLogin(name : String , password : String , isBackground : Boolean , completionHandler : LoginCompletionHandler) {

     }

}