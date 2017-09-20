package com.adcreators.android.utilities.widgets

import android.content.Context
import android.util.AttributeSet
import android.widget.ImageView
import android.widget.LinearLayout
import com.adcreators.android.utilities.R

class ToggleBox : LinearLayout {

     var txtOption : TxtView? = null
     var imgOption : ImageView? = null

     constructor(context : Context) : super(context) {
          init()
     }
     constructor(context : Context , attrs : AttributeSet?) : super(context , attrs) {
          init()
     }

     private fun init() {

          inflate(context , R.layout.item_textimage , this)
          txtOption = findViewById(R.id.txtOption)
          imgOption = findViewById(R.id.imgOption)

     }


}