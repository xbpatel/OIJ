package com.adcreators.android.utilities.extentions

import android.content.Context
import android.content.Intent
import android.graphics.Color
import android.graphics.drawable.GradientDrawable
import android.os.Bundle
import android.os.Parcel
import android.os.Parcelable
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast


private val doElseStub : () -> Unit = {}

/**
 * Return true if the current object is null.
 */
fun <T : Any?> T.isNull() : Boolean = this == null

/**
 * Execute the given [block] if the current object is null.
 */
inline fun <T> T.letIfNull(crossinline block : () -> Unit) = {
     if (this == null) block()
}

/**
 * Based on a given [predicate], execute one of the given functions [doIf] or [doElse].
 */
fun wonder(predicate : () -> Boolean ,
           doIf : () -> Unit ,
           doElse : () -> Unit = doElseStub) {
     predicate.invoke().wonder(doIf , doElse)
}

/**
 * Execute [doIf] or [doElse] depending if the value of this [Boolean] is true or false.
 */
inline fun Boolean.wonder(
        doIf : () -> Unit ,
        doElse : () -> Unit
) {
     if (this) doIf.invoke() else doElse.invoke()
}

/**
 * Check if the given [CharSequence] contains one of the given [elements].
 */
fun CharSequence.containsSome(vararg elements : CharSequence , ignoreCase : Boolean = false) : Boolean =
        elements.filter { charSequence -> contains(charSequence , ignoreCase) }.isNotEmpty()

/**
 * Return a [Parcelable.Creator] from the current class which extens [Parcelable].
 */
inline fun <reified T : Parcelable> createParcel(
        crossinline createFromParcel : (Parcel) -> T?) : Parcelable.Creator<T> =
        object : Parcelable.Creator<T> {
             override fun createFromParcel(source : Parcel) : T? = createFromParcel(source)
             override fun newArray(size : Int) : Array<out T?> = arrayOfNulls(size)
        }

/*
     For swaping two values in mutable list
 */
fun MutableList<Int>.swap(index1 : Int , index2 : Int) {
     val tmp = this[index1] // 'this' corresponds to the list
     this[index1] = this[index2]
     this[index2] = tmp
}

/*
     For setting rounded background to a view
 */
fun View.setRoundedBackgroundSolid(backgroundColor : Int , radius : Float) {

     val shape = GradientDrawable()
     shape.shape = GradientDrawable.RECTANGLE
     shape.cornerRadii = floatArrayOf(radius , radius , radius , radius , radius , radius , radius , radius)
     shape.setColor(backgroundColor)
     shape.setStroke(0 , Color.TRANSPARENT)
     this.setBackground(shape)
}

/*
     For setting rounded background to a view
 */
fun View.setRoundedBackgroundStroke(strokeColor : Int , radius : Float , strokeWidth : Int) {
     val shape = GradientDrawable()
     shape.shape = GradientDrawable.RECTANGLE
     shape.cornerRadii = floatArrayOf(radius , radius , radius , radius , radius , radius , radius , radius)
     shape.setColor(Color.TRANSPARENT)
     shape.setStroke(strokeWidth , strokeColor)
     this.setBackground(shape)
}

fun <T> Context.showNextScreen(java : Class<T> , bundle : Bundle? = null) {
     var intent = Intent(this , java)
     intent.putExtra("extra" , bundle)
     startActivity(intent)
}

fun Context.toast(message : String) {
     Toast.makeText(this , message , Toast.LENGTH_SHORT).show()
}

fun Context.e(tag : String , message : String) {
     Log.e(tag , message)
}

fun Context.i(tag : String , message : String) {
     Log.i(tag , message)
}

fun Context.v(tag : String , message : String) {
     Log.v(tag , message)
}

fun ViewGroup.inflate(layoutId : Int) : View {
     return LayoutInflater.from(context).inflate(layoutId , this , false)
}


