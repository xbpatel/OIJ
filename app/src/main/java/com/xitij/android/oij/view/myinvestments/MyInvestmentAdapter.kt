package com.xitij.android.oij.view.myinvestments

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.adcreators.android.xion.view.callbacks.OnFragmentInteractionListener
import com.xitij.android.oij.R
import com.xitij.android.oij.model.InvestmentModel

/**
 * [RecyclerView.Adapter] that can display a [] and makes a call to the
 * specified [OnListFragmentInteractionListener].
 * TODO: Replace the implementation with code for your data type.
 */
class MyInvestmentAdapter(private val mValues: List<InvestmentModel>, private val mListener: OnFragmentInteractionListener?) : RecyclerView.Adapter<MyInvestmentAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
                .inflate(R.layout.fragment_investmentmodel, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.mItem = mValues[position]
      //  holder.mIdView.text = mValues[position].id.toString()
        // holder.mContentView.text = mValues[position].title

        holder.mView.setOnClickListener {

            var model = holder.mItem
            //mListener?.onFragmentInteraction(model!!.id)
        }
    }

    override fun getItemCount(): Int {
        return mValues.size
    }

    inner class ViewHolder(val mView: View) : RecyclerView.ViewHolder(mView) {
      //  var mIdView: TextView
       // var mContentView: TextView
        var mItem: InvestmentModel? = null

        init {
         //   mIdView = mView.findViewById(R.id.id)
         //   mContentView = mView.findViewById(R.id.content)
        }

    }
}
