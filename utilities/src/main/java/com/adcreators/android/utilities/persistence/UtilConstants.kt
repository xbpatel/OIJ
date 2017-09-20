package com.adcreators.android.utilities.persistence

import android.content.Context
import android.graphics.Typeface
import com.adcreators.android.utilities.api.OKHtpClient
import com.adcreators.android.utilities.api.RestClient

/**
 * Created by excellent-3 on 20/07/17.
 */
class UtilConstants {
//     <enum name="light" value="1" />
//     <enum name="regular" value="2" />
//     <enum name="bold" value="3" />
//     <enum name="black" value="4" />
     companion object {
          //region:- functions
          fun getGothamFont(context : Context , fTypeValue : Int) : Typeface {

               var typeFace : Typeface? = null

               when (fTypeValue) {
                    1 -> typeFace = Typeface.createFromAsset(context.assets , "fonts/gotham-thin.ttf")
                    2 -> typeFace = Typeface.createFromAsset(context.assets , "fonts/gotham-regular.ttf")
                    3 -> typeFace = Typeface.createFromAsset(context.assets , "fonts/gotham-bold.ttf")
                    4 -> typeFace = Typeface.createFromAsset(context.assets , "fonts/gotham-black.ttf")
               }
               return typeFace !!
          }

          var restClient : RestClient = OKHtpClient()
          var HUD_THEME = android.R.style.Theme_Translucent_NoTitleBar
     }

}


