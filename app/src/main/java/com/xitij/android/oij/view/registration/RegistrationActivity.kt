package com.xitij.android.oij.view.registration

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.xitij.android.oij.R
import kotlinx.android.synthetic.main.appbar.*

class RegistrationActivity : AppCompatActivity() {

     override fun onCreate(savedInstanceState : Bundle?) {
          super.onCreate(savedInstanceState)
          setContentView(R.layout.activity_registration)

          toolbar.title = "Registration"
          setSupportActionBar(toolbar)

     }
}
