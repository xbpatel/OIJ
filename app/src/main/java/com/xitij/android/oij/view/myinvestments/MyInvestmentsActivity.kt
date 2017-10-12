package com.xitij.android.oij.view.myinvestments

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.MenuItem
import com.adcreators.android.xion.view.callbacks.OnFragmentInteractionListener
import com.xitij.android.oij.R
import com.xitij.android.oij.model.InvestmentModel
import kotlinx.android.synthetic.main.appbar.*

class MyInvestmentsActivity : AppCompatActivity(), OnFragmentInteractionListener {
    override fun onFragmentInteraction(fragment: Fragment, value: String) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_my_investments)

        setSupportActionBar(toolbar)
        supportActionBar?.title = "My Investments"
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        supportFragmentManager.beginTransaction().replace(R.id.containerInvestments, InvestmentlFragment.newInstance(1)).commit()


    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {

        when (item?.itemId) {

            android.R.id.home -> finish()

        }


        return super.onOptionsItemSelected(item)
    }
}
