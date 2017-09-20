package com.adcreators.android.utilities.extentions

import android.widget.TextView
import com.adcreators.android.utilities.R
import java.util.regex.Matcher
import java.util.regex.Pattern

/**
 * Created by excellent-3 on 26/07/17.
 */

fun TextView.setTextWithSize(size : Float , value : String) {
     this.setText(value)
     this.setTextSize(android.util.TypedValue.COMPLEX_UNIT_SP , size)
}

fun TextView.isValidEmail() : Boolean {

     var EMAIL_PATTERN : String = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@" + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$"
     val pattern : Pattern
     val matcher : Matcher
     pattern = Pattern.compile(EMAIL_PATTERN)
     matcher = pattern.matcher(this.text.toString())
     return matcher.matches()
}

fun TextView.leftIcon(icon : Int) {
     this.setCompoundDrawablesWithIntrinsicBounds(icon , 0 , 0 , 0)
}

fun TextView.rightIcon(icon : Int) {
     this.setCompoundDrawablesWithIntrinsicBounds(0 , 0 , icon , 0)
}

fun TextView.topIcon(icon : Int) {
     this.setCompoundDrawablesWithIntrinsicBounds(0 , icon , 0 , 0)
}

fun TextView.bottomIcon(icon : Int) {
     this.setCompoundDrawablesWithIntrinsicBounds(0 , 0 , 0 , icon)
}

fun TextView.setLorem() {
     this.setText(resources.getString(R.string.lorem))
}

