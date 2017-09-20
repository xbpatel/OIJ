package com.adcreators.android.customarchitecturekotlin

import android.util.Log
import kotlin.properties.Delegates


class React<T> {

     var readValue : T? = null

     var listner : ((T) -> Unit)? = null
     var writeValue: T
          set(value){

               this.readValue = value
               if(this.readValue != null)
                    listner?.invoke(this.readValue!!)
          }

     constructor (mV : T) {
          this.writeValue = mV
          this.readValue = mV
          Log.e("Initial Value",""+readValue)
     }

     fun bind(listner: ((T) -> Unit)?): Unit {
          this.listner = listner
          if(this.readValue != null)
               listner?.invoke(this.readValue!!)
     }

}



