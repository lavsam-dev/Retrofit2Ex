package lavsam.gb.libs.poplibs.retrofit2ex.Interface

import lavsam.gb.libs.poplibs.retrofit2ex.Model.Movie
import retrofit2.Call
import retrofit2.http.GET

interface RetrofitServices {
    @GET("marvel")
    fun getMovieList(): Call<MutableList<Movie>>
}