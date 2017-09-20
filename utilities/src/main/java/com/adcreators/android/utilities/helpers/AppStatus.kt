package com.adcreators.android.utilities.helpers

import android.content.Context
import android.net.ConnectivityManager
import android.util.Log


/**
 * Created by excellent-3 on 26/07/17.
 */
class AppStatus {


     companion object {

          var connected : Boolean = false
          var context : Context? = null
          var connectivityManager : ConnectivityManager? = null

          fun isOnline(ctx : Context) : Boolean {
               context = ctx.applicationContext
               try {
                    connectivityManager = context?.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager

                    val networkInfo = connectivityManager !!.getActiveNetworkInfo()
                    connected = networkInfo != null && networkInfo.isAvailable &&
                            networkInfo.isConnected
                    return connected


               } catch (e : Exception) {
                    println("CheckConnectivity Exception: " + e.message)
                    Log.v("connectivity" , e.toString())
               }

               return connected
          }


     }


}