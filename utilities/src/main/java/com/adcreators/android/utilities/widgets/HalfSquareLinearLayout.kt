package com.adcreators.android.utilities.widgets

import android.content.Context
import android.util.AttributeSet
import android.widget.LinearLayout

/**
 * Created by excellent-3 on 22/08/17.
 */
open class HalfSquareLinearLayout : LinearLayout {


     constructor(context : Context) : super(context) {


     }

     constructor(context : Context , attrs : AttributeSet) : super(context , attrs) {


     }

     public override fun onMeasure(widthMeasureSpec : Int , heightMeasureSpec : Int) {

          super.onMeasure(widthMeasureSpec , widthMeasureSpec)

          val width = MeasureSpec.getSize(widthMeasureSpec)
          val height = MeasureSpec.getSize(heightMeasureSpec)
          val size = if (width > height) height else width
          setMeasuredDimension(size , (size/2))

     }

}