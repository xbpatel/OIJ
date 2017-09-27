package com.xitij.android.oij.view.terms

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.adcreators.android.utilities.extentions.showNextScreen
import com.xitij.android.oij.R
import com.xitij.android.oij.view.home.InvestorsHomeActivity
import kotlinx.android.synthetic.main.activity_terms_condition.*
import kotlinx.android.synthetic.main.appbar.*

class TermsConditionActivity : AppCompatActivity() {

     override fun onCreate(savedInstanceState : Bundle?) {
          super.onCreate(savedInstanceState)
          setContentView(R.layout.activity_terms_condition)

          toolbar.title = "Terms and Conditions"
          setSupportActionBar(toolbar)

          btnAgree.setOnClickListener {
               showNextScreen(InvestorsHomeActivity::class.java)
               finish()
          }

     }
}
