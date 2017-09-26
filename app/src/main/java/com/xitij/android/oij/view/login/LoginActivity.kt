package com.xitij.android.oij.view.login

import android.os.Bundle
import android.support.design.widget.TabLayout
import android.support.v4.app.Fragment
import android.support.v7.app.AppCompatActivity
import com.adcreators.android.xion.view.callbacks.OnFragmentInteractionListener
import com.xitij.android.oij.R
import com.xitij.android.oij.view.adapter.LoginAdapter
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() , OnFragmentInteractionListener {


     override fun onFragmentInteraction(fragment : Fragment , value : String) {

     }

     override fun onCreate(savedInstanceState : Bundle?) {
          super.onCreate(savedInstanceState)
          setContentView(R.layout.activity_login)

          tabLogin.addTab(tabLogin.newTab().setText("USER").setTag("I"))
          tabLogin.addTab(tabLogin.newTab().setText("MPIN").setTag("F"))
          tabLogin.addTab(tabLogin.newTab().setText("TOUCH ID").setTag("D"))

          tabLogin.getTabAt(0) !!.setIcon(R.drawable.ic_person_black_24dp)
          tabLogin.getTabAt(1) !!.setIcon(R.drawable.ic_dialpad_black_24dp)
          tabLogin.getTabAt(2) !!.setIcon(R.drawable.ic_fingerprint_black_24dp)

          pagerLogin.adapter = LoginAdapter(supportFragmentManager)
          pagerLogin.offscreenPageLimit = 2
          tabLogin.setupWithViewPager(pagerLogin)
          setSelection(0)
          setUnselected(1)
          setUnselected(2)
          tabLogin.invalidate()
          tabLogin.addOnTabSelectedListener(object : TabLayout.ViewPagerOnTabSelectedListener(pagerLogin) {

               override fun onTabSelected(tab : TabLayout.Tab?) {
                    super.onTabSelected(tab)
                    setSelection(tab?.position)

               }

               override fun onTabUnselected(tab : TabLayout.Tab?) {
                    super.onTabUnselected(tab)
                    setUnselected(tab?.position)


               }

          })

     }

     private fun setUnselected(position : Int?) {
          when (position) {

               0 -> tabLogin.getTabAt(0) !!.setIcon(R.drawable.ic_person_black_24dp)
               1 -> tabLogin.getTabAt(1) !!.setIcon(R.drawable.ic_dialpad_black_24dp)
               2 -> tabLogin.getTabAt(2) !!.setIcon(R.drawable.ic_fingerprint_black_24dp)

          }
     }

     private fun setSelection(position : Int?) {
          when (position) {
               0 -> tabLogin.getTabAt(0) !!.setIcon(R.drawable.ic_person_black_24dp_selected)
               1 -> tabLogin.getTabAt(1) !!.setIcon(R.drawable.ic_dialpad_black_24dp_selected)
               2 -> tabLogin.getTabAt(2) !!.setIcon(R.drawable.ic_fingerprint_black_24dp_selected)
          }


     }


}
