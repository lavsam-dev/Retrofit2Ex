package lavsam.gb.libs.poplibs.retrofit2ex.Common

import lavsam.gb.libs.poplibs.retrofit2ex.Interface.RetrofitServices
import lavsam.gb.libs.poplibs.retrofit2ex.Retrofit.RetrofitClient

object Common {
//    private val BASE_URL = "https://www.simplifiedcoding.net/demos/"
    private val BASE_URL = "https://api.github.com/"

    val retrofitService: RetrofitServices
        get() = RetrofitClient.getClient(BASE_URL).create(RetrofitServices::class.java)
}