package com.adcreators.android.utilities.api

import java.io.IOException


/**
 * Created by excellent-3 on 25/07/17.
 */
class OKHtpResult(override var data : String? , override var error : IOException?) : Result<String , IOException> {
}