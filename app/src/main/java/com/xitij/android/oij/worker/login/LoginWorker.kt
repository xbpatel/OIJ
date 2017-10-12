package com.xitij.android.oij.worker.login

import com.xitij.android.oij.worker.LoginWorkerInterface

class LoginWorker {

     var loginWorkerInterface : LoginWorkerInterface? = null

     constructor (loginWorkerInterface : LoginWorkerInterface) {
          this.loginWorkerInterface = loginWorkerInterface

     }

}