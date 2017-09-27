package com.xitij.android.oij.view.login.fragments

import android.content.Context
import android.net.Uri
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.adcreators.android.xion.view.callbacks.OnFragmentInteractionListener

import com.xitij.android.oij.R

/**
 * A simple [Fragment] subclass.
 * Activities that contain this fragment must implement the
 * [FingerprintLoginFragment.OnFragmentInteractionListener] interface
 * to handle interaction events.
 * Use the [FingerprintLoginFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class FingerprintLoginFragment : Fragment() {


     private var mParam1 : String? = null
     private var mParam2 : String? = null

     private var mListener : OnFragmentInteractionListener? = null

     override fun onCreate(savedInstanceState : Bundle?) {
          
          super.onCreate(savedInstanceState)
          if (arguments != null) {
               mParam1 = arguments.getString(ARG_PARAM1)
               mParam2 = arguments.getString(ARG_PARAM2)
          }
     }

     override fun onCreateView(inflater : LayoutInflater , container : ViewGroup? ,
                               savedInstanceState : Bundle?) : View? {
          // Inflate the layout for this fragment
          return inflater.inflate(R.layout.fragment_fingerprint_login , container , false)
     }


     override fun onAttach(context : Context) {
          super.onAttach(context)
          if (context is OnFragmentInteractionListener) {
               mListener = context
          } else {
               throw RuntimeException(context.toString() + " must implement OnFragmentInteractionListener")
          }
     }

     override fun onDetach() {
          super.onDetach()
          mListener = null
     }



     companion object {
          // TODO: Rename parameter arguments, choose names that match
          // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
          private val ARG_PARAM1 = "param1"
          private val ARG_PARAM2 = "param2"

          /**
           * Use this factory method to create a new instance of
           * this fragment using the provided parameters.
           *
           * @param param1 Parameter 1.
           * @param param2 Parameter 2.
           * @return A new instance of fragment FingerprintLoginFragment.
           */
          // TODO: Rename and change types and number of parameters
          fun newInstance(param1 : String , param2 : String) : FingerprintLoginFragment {
               val fragment = FingerprintLoginFragment()
               val args = Bundle()
               args.putString(ARG_PARAM1 , param1)
               args.putString(ARG_PARAM2 , param2)
               fragment.arguments = args
               return fragment
          }
     }
}    // Required empty public constructor
