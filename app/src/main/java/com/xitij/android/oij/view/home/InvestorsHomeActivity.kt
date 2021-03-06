package com.xitij.android.oij.view.home

import android.os.Bundle
import android.support.design.widget.NavigationView
import android.support.design.widget.Snackbar
import android.support.v4.app.Fragment
import android.support.v4.view.GravityCompat
import android.support.v7.app.ActionBarDrawerToggle
import android.support.v7.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import com.adcreators.android.utilities.extentions.toast
import com.adcreators.android.xion.view.callbacks.OnFragmentInteractionListener
import com.xitij.android.oij.R
import com.xitij.android.oij.view.home.fragment.InvestorHomeFragment
import kotlinx.android.synthetic.main.activity_drawer.*
import kotlinx.android.synthetic.main.app_bar_drawer.*

class InvestorsHomeActivity : AppCompatActivity() , NavigationView.OnNavigationItemSelectedListener , OnFragmentInteractionListener{
     override fun onFragmentInteraction(fragment : Fragment , value : String) {
          TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
     }

     override fun onCreate(savedInstanceState : Bundle?) {
          super.onCreate(savedInstanceState)
          setContentView(R.layout.activity_drawer)
          toolbar.title = "Investor Dashboard"
          setSupportActionBar(toolbar)

          fab.setOnClickListener { view ->
               Snackbar.make(view , "Replace with your own action" , Snackbar.LENGTH_LONG)
                       .setAction("Action" , null).show()
          }

          val toggle = ActionBarDrawerToggle(
                  this , drawer_layout , toolbar , R.string.navigation_drawer_open , R.string.navigation_drawer_close)
          drawer_layout.addDrawerListener(toggle)
          toggle.syncState()

          nav_view.setNavigationItemSelectedListener(this)

          supportFragmentManager.beginTransaction().replace(R.id.container , InvestorHomeFragment.newInstance("" , "")).commit()

     }

     override fun onBackPressed() {

          if (drawer_layout.isDrawerOpen(GravityCompat.START)) {
               drawer_layout.closeDrawer(GravityCompat.START)
          } else {
               super.onBackPressed()
          }
     }

     override fun onCreateOptionsMenu(menu : Menu) : Boolean {
          // Inflate the menu; this adds items to the action bar if it is present.
          menuInflater.inflate(R.menu.drawer , menu)
          return false
     }

     override fun onOptionsItemSelected(item : MenuItem) : Boolean {
          // Handle action bar item clicks here. The action bar will
          // automatically handle clicks on the Home/Up button, so long
          // as you specify a parent activity in AndroidManifest.xml.
          when (item.itemId) {
               R.id.action_settings -> return true
               else -> return super.onOptionsItemSelected(item)
          }
     }

     override fun onNavigationItemSelected(item : MenuItem) : Boolean {

          // Handle navigation view item clicks here.
          when (item.itemId) {

               R.id.nav_home_investor -> {
                    toast("Home")
                    supportFragmentManager.beginTransaction().replace(R.id.container , InvestorHomeFragment.newInstance("" , "")).commit()
               }
               R.id.nav_gallery -> {

               }
               R.id.nav_slideshow -> {

               }
               R.id.nav_manage -> {

               }

          }

          drawer_layout.closeDrawer(GravityCompat.START)
          return true
     }
}
