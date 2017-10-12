package com.xitij.android.oij.view.terms

import android.content.DialogInterface
import android.os.Bundle
import android.support.v7.app.AlertDialog
import android.support.v7.app.AppCompatActivity
import com.adcreators.android.utilities.extentions.showNextScreen
import com.xitij.android.oij.R
import com.xitij.android.oij.view.home.DistributorsHomeActivity
import com.xitij.android.oij.view.home.InvestorsHomeActivity
import kotlinx.android.synthetic.main.activity_terms_condition.*
import kotlinx.android.synthetic.main.appbar.*

class TermsConditionActivity : AppCompatActivity() {

     override fun onCreate(savedInstanceState : Bundle?) {
          super.onCreate(savedInstanceState)
          showNextScreen(InvestorsHomeActivity::class.java)
          setContentView(R.layout.activity_terms_condition)

          toolbar.title = "Terms and Conditions"
          setSupportActionBar(toolbar)

          btnAgree.setOnClickListener {

               showNextScreen(InvestorsHomeActivity::class.java)

//               val builder = AlertDialog.Builder(this)
//               builder.setMessage("Which home screen you like to visit ?  Investor or Distributor? \n\n\n\nThis is for navigational purpose, This will not display in actual functionality.")
//                       .setCancelable(true)
//                       .setPositiveButton("Investor" , DialogInterface.OnClickListener { dialog , id -> showNextScreen(InvestorsHomeActivity::class.java) })
//                       .setNegativeButton("Distributor" , DialogInterface.OnClickListener { dialog , id ->
//                            showNextScreen(DistributorsHomeActivity::class.java)
//                       })
//               val alert = builder.create()
//               alert.show()

          }

     }
}
