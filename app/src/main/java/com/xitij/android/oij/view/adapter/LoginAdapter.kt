package com.xitij.android.oij.view.adapter

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter
import com.xitij.android.oij.view.login.fragments.FingerprintLoginFragment
import com.xitij.android.oij.view.login.fragments.PincodeLoginFragment
import com.xitij.android.oij.view.login.fragments.UserNameLoginFragment

/**
 * Created by excellent-3 on 26/09/17.
 */
class LoginAdapter(fm : FragmentManager) : FragmentPagerAdapter(fm) {

     override fun getItem(position : Int) : Fragment? {
          var fragment : Fragment? = null

          when (position) {

               0 -> fragment = UserNameLoginFragment.newInstance("" , "")
               1 -> fragment = PincodeLoginFragment.newInstance("" , "")
               2 -> fragment = FingerprintLoginFragment.newInstance("" , "")
          }

          return fragment
     }

     override fun getCount() : Int = 3

     override fun getPageTitle(position : Int) : CharSequence? {
          var title : String? = null

          when (position) {

               0 -> title = "USER"
               1 -> title = "MPIN"
               2 -> title = "TOUCH ID"

          }

          return title
     }
}