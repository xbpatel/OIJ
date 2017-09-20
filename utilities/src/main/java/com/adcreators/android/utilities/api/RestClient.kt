package com.adcreators.android.utilities.api

/**
 * Created by excellent-3 on 20/07/17.
 */
interface RestClient {

     fun request(url : String , httpMethod : String , header : Map<String , String>? , jsonBody : String? ,
                 isBackground : Boolean , completion : (Any?) -> Unit)


}

interface Header {
     var header : Map<String , String>?
}

interface Result<T , W> {
     var data : T?
     var error : W?

}

//enum Status: Int
//{
//     case success = 200
//     case noData = 404
//}

enum class Status {

     SUCCESS {
          var success = 200
     } ,
     NODATA {
          var nodata = 404
     }

}


enum class ResponseError {

     ZERORESULT {
          var error = String
     }

}

//enum RestMethod: String
//{
//     case post   = "POST"
//     case get    = "GET"
//     case delete = "DELETE"
//     case put    = "PUT"
//}

enum class RestMethod {

     POST {
          var post = "POST"
     } ,
     GET {
          var get = "GET"
     } ,
     DELETE {
          var delete = "DELETE"
     } ,
     PUT {
          var put = "PUT"
     }
}
