package com.adcreators.android.utilities.widgets

import android.content.Context
import android.support.v7.app.AppCompatDialog
import android.view.View
import android.widget.ImageView
import com.adcreators.android.utilities.R
import com.adcreators.android.utilities.persistence.UtilConstants

/**
 * Created by excellent-3 on 01/08/17.
 */
class Hud : AppCompatDialog {

     constructor(context : Context? , theme : Int) : super(context , theme) {
          init()
     }

     private fun init() {
          setContentView(R.layout.item_hud)
     }

     open fun setThemeColor(color : Int) {

          var divider = findViewById<View>(R.id.dividerHud) as View
          var btnNegative = findViewById<Buton>(R.id.btnHudNegativeButton) as Buton
          var btnPositive = findViewById<Buton>(R.id.btnHudPositiveButton) as Buton
          divider !!.setBackgroundColor(color)
          btnNegative.setTextColor(color)
          btnPositive.setTextColor(color)
     }

     open fun setTitleAndDescription(title : String , description : String) {

          var titleTxt = findViewById<TxtView>(R.id.txtTitleHud) as TxtView
          var subTitle = findViewById<TxtView>(R.id.txtDescriptionHud) as TxtView
          titleTxt.setText(title)
          subTitle.setText(description)
     }

     open fun setIcon(icon : Int) {

          var image = findViewById<ImageView>(R.id.imgHudIcon) as ImageView
          image.setImageResource(icon)

     }

}
