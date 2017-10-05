package com.xitij.android.oij.worker

import com.xitij.android.oij.model.ResponseLogin

/**
 * Created by excellent-3 on 05/10/17.
 */

/**
 * Created by excellent-3 on 25/07/17.
 */
interface LoginWorkerInterface {
     fun processLogin (name : String, password : String, isBackground : Boolean, completionHandler : LoginCompletionHandler)
}

typealias LoginCompletionHandler = (ResponseLogin?) -> Unit

