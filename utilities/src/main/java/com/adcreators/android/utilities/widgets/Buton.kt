package com.adcreators.android.utilities.widgets

import android.content.Context
import android.content.res.TypedArray
import android.util.AttributeSet
import android.widget.Button
import com.adcreators.android.utilities.R
import com.adcreators.android.utilities.persistence.UtilConstants


class Buton : Button {
    private var fTypeValue = 2
    constructor(context: Context) : super(context) {
        if (! isInEditMode()) {
            init();
        }
    }

    constructor(context: Context?, attrs: AttributeSet?) : super(context, attrs) {
        if (! isInEditMode) {

            var a : TypedArray = context !!.obtainStyledAttributes(attrs , R.styleable.Buton , 0 , 0)
            try {

                if (a.hasValue(R.styleable.Buton_fontButon)) {
                    fTypeValue = a.getInt(R.styleable.Buton_fontButon , 0)
                }

            } finally {
                a.recycle()
            }

            init()
        }
    }

    private fun init() {
        setTypeface(UtilConstants.getGothamFont(context,fTypeValue))
    }

}