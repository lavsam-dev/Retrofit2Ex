package lavsam.gb.libs.poplibs.retrofit2ex.Interface

import lavsam.gb.libs.poplibs.retrofit2ex.Model.Movie
import lavsam.gb.libs.poplibs.retrofit2ex.Model.Movies
import retrofit2.Call
import retrofit2.http.GET

interface RetrofitServices {
//    @GET("marvel")
//    @GET("users")
    @GET("pokemon")
//    fun getMovieList(): Call<MutableList<Movie>>
    fun getMovieList(): Call<Movies>
}