package com.xitij.android.oij.view.login

import android.os.Bundle
import android.support.design.widget.TabLayout
import android.support.v7.app.AppCompatActivity
import com.xitij.android.oij.R
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {

     override fun onCreate(savedInstanceState : Bundle?) {
          super.onCreate(savedInstanceState)
          setContentView(R.layout.activity_login)

          tabLogin.addTab(tabLogin.newTab().setText("USER").setTag("I"))
          tabLogin.addTab(tabLogin.newTab().setText("MPIN").setTag("F"))
          tabLogin.addTab(tabLogin.newTab().setText("TOUCH ID").setTag("D"))

          tabLogin.getTabAt(0) !!.setIcon(R.drawable.ic_person_black_24dp)
          tabLogin.getTabAt(1) !!.setIcon(R.drawable.ic_dialpad_black_24dp)
          tabLogin.getTabAt(2) !!.setIcon(R.drawable.ic_fingerprint_black_24dp)

          tabLogin.setupWithViewPager(pagerLogin)
          tabLogin.addOnTabSelectedListener(object : TabLayout.ViewPagerOnTabSelectedListener(pagerLogin) {

               override fun onTabSelected(tab : TabLayout.Tab?) {
                    super.onTabSelected(tab)

                    when (tab?.position) {

                         0 -> tabLogin.getTabAt(0) !!.setIcon(R.drawable.ic_person_black_24dp_selected)
                         1 -> tabLogin.getTabAt(1) !!.setIcon(R.drawable.ic_dialpad_black_24dp_selected)
                         2 -> tabLogin.getTabAt(2) !!.setIcon(R.drawable.ic_fingerprint_black_24dp_selected)
                    }

               }

               override fun onTabUnselected(tab : TabLayout.Tab?) {
                    super.onTabUnselected(tab)

                    when (tab?.position) {

                         0 -> tabLogin.getTabAt(0) !!.setIcon(R.drawable.ic_person_black_24dp)
                         1 -> tabLogin.getTabAt(1) !!.setIcon(R.drawable.ic_dialpad_black_24dp)
                         2 -> tabLogin.getTabAt(2) !!.setIcon(R.drawable.ic_fingerprint_black_24dp)

                    }

               }

          })

     }


}
