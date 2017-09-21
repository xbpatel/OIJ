package com.xitij.android.oij.view.app

import android.os.Bundle
import android.os.CountDownTimer
import android.support.v7.app.AppCompatActivity
import com.adcreators.android.utilities.extentions.showNextScreen
import com.xitij.android.oij.R
import com.xitij.android.oij.view.login.LoginActivity

class SplashActivity : AppCompatActivity() {

     override fun onCreate(savedInstanceState : Bundle?) {
          super.onCreate(savedInstanceState)
          setContentView(R.layout.activity_splash)

          object : CountDownTimer(2500 , 1000) {

               override fun onTick(l : Long) {
               }

               override fun onFinish() {
                    showNextScreen(LoginActivity::class.java)
               }
          }.start()

     }

}
