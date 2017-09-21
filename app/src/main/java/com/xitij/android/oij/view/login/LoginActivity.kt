package com.xitij.android.oij.view.login

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.xitij.android.oij.R
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {

     override fun onCreate(savedInstanceState : Bundle?) {
          super.onCreate(savedInstanceState)
          setContentView(R.layout.activity_login)

          tabLogin.addTab(tabLogin.newTab().setText("U").setTag("I"))
          tabLogin.addTab(tabLogin.newTab().setText("P").setTag("F"))
          tabLogin.addTab(tabLogin.newTab().setText("F").setTag("D"))

     }


}
