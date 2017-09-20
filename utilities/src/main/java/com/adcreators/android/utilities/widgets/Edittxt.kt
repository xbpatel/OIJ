package com.adcreators.android.utilities.widgets

import android.content.Context
import android.content.res.TypedArray
import android.util.AttributeSet
import android.widget.EditText
import com.adcreators.android.utilities.R
import com.adcreators.android.utilities.persistence.UtilConstants

/**
 * Created by excellent-3 on 20/07/17.
 */
class Edittxt : EditText {

    private var fTypeValue = 2
    constructor(context: Context) : super(context) {
        if (! isInEditMode()) {
            init();
        }
    }

    constructor(context: Context?, attrs: AttributeSet?) : super(context, attrs) {
        if (! isInEditMode) {

            var a : TypedArray = context !!.obtainStyledAttributes(attrs , R.styleable.Edittxt , 0 , 0)
            try {

                if (a.hasValue(R.styleable.Edittxt_fontEdit)) {
                    fTypeValue = a.getInt(R.styleable.Edittxt_fontEdit , 0)
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