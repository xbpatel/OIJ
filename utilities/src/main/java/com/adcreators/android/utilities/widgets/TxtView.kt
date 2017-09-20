package com.adcreators.android.utilities.widgets

import android.content.Context
import android.content.res.TypedArray
import android.util.AttributeSet
import android.widget.TextView
import com.adcreators.android.utilities.R
import com.adcreators.android.utilities.persistence.UtilConstants


/**
 * Created by excellent-3 on 20/07/17.
 */
class TxtView : TextView {


     private var fTypeValue = 2

     constructor(context : Context) : super(context) {
          if (! isInEditMode()) {
               applyTypeFace()
          }
     }

     constructor(context : Context? , attrs : AttributeSet?) : super(context , attrs) {
          if (! isInEditMode) {

               var a : TypedArray = context !!.obtainStyledAttributes(attrs , R.styleable.TxtView , 0 , 0)
               try {

                    if (a.hasValue(R.styleable.TxtView_fontTxt)) {
                         fTypeValue = a.getInt(R.styleable.TxtView_fontTxt , 0)
                    }

               } finally {
                    a.recycle()
               }

               applyTypeFace()
          }
     }

     fun setBold() {
          fTypeValue = 3
          applyTypeFace()
     }

     fun setRegular() {

          fTypeValue = 2
          applyTypeFace()
     }


     fun applyTypeFace() {
          setTypeface(UtilConstants.getGothamFont(context , fTypeValue))
     }

}
