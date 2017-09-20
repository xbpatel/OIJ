package com.adcreators.android.utilities.helpers

/**
 * Created by excellent-3 on 31/08/17.
 */
import android.graphics.Typeface
import android.text.SpannableString
import android.text.Spanned
import android.text.TextPaint
import android.text.style.ClickableSpan
import android.text.style.ForegroundColorSpan
import android.text.style.RelativeSizeSpan
import android.text.style.StrikethroughSpan
import android.text.style.StyleSpan
import android.text.style.URLSpan
import android.text.style.UnderlineSpan
import android.view.View

class AdvancedSpannableString(source : CharSequence) : SpannableString(source) {

     var mainString : String
     private var listner : OnClickableSpanListner? = null

     init {
          mainString = source.toString()

     }

     fun setSpanClickListener(listner : OnClickableSpanListner) {
          this.listner = listner
     }

     fun setColor(color : Int , subString : String) {

          val start = mainString.indexOf(subString)
          val end = start + subString.length
          val span = ForegroundColorSpan(color)
          setSpan(span , start , end , Spanned.SPAN_EXCLUSIVE_EXCLUSIVE)

     }

     fun setBold(subString : String) {

          val start = mainString.indexOf(subString)
          val end = start + subString.length
          val span = StyleSpan(Typeface.BOLD)
          setSpan(span , start , end , Spanned.SPAN_EXCLUSIVE_EXCLUSIVE)
     }

     fun setItalic(subString : String) {

          val start = mainString.indexOf(subString)
          val end = start + subString.length
          val span = StyleSpan(Typeface.ITALIC)
          setSpan(span , start , end , Spanned.SPAN_EXCLUSIVE_EXCLUSIVE)
     }

     fun setBoldItalic(subString : String) {

          val start = mainString.indexOf(subString)
          val end = start + subString.length
          val span = StyleSpan(Typeface.BOLD_ITALIC)
          setSpan(span , start , end , Spanned.SPAN_EXCLUSIVE_EXCLUSIVE)
     }

     fun setCustomSizeOf(size : Float , subString : String) {

          val start = mainString.indexOf(subString)
          val end = start + subString.length
          val span = RelativeSizeSpan(size)
          setSpan(span , start , end , Spanned.SPAN_EXCLUSIVE_EXCLUSIVE)

     }

     fun setStrikeThroughIn(subString : String) {

          val start = mainString.indexOf(subString)
          val end = start + subString.length
          val span = StrikethroughSpan()
          setSpan(span , start , end , Spanned.SPAN_EXCLUSIVE_EXCLUSIVE)

     }

     fun setUnderLine(subString : String) {

          val start = mainString.indexOf(subString)
          val end = start + subString.length
          val span = UnderlineSpan()
          setSpan(span , start , end , Spanned.SPAN_EXCLUSIVE_EXCLUSIVE)

     }

     fun setClickableSpanTo(subString : String) {

          val start = mainString.indexOf(subString)
          val end = start + subString.length
          val span = object : ClickableSpan() {

               override fun onClick(widget : View) {
                    listner !!.onSpanClick()
               }

               override fun updateDrawState(ds : TextPaint) {
                    super.updateDrawState(ds)
                    ds.isUnderlineText = false
               }
          }


          setSpan(span , start , end , Spanned.SPAN_EXCLUSIVE_EXCLUSIVE)

     }

     fun setUrlSpan(url : String , subString : String) {

          val start = mainString.indexOf(subString)
          val end = start + subString.length
          val span = URLSpan(url)
          setSpan(span , start , end , Spanned.SPAN_EXCLUSIVE_EXCLUSIVE)

     }

     interface OnClickableSpanListner {
          fun onSpanClick()
     }


}