package lavsam.gb.libs.poplibs.retrofit2ex.Interface

import lavsam.gb.libs.poplibs.retrofit2ex.Model.Movie
import lavsam.gb.libs.poplibs.retrofit2ex.Model.Movies
import retrofit2.Call
import retrofit2.http.GET

interface RetrofitServices {
//    @GET("marvel")
//    @GET("users")
    @GET("pokemon")
//    @GET("3/discover/movie?language=en&sort_by=popularity.desc&api_key=dc14a9f3b0182612c3b5a4e43393fb15")
//    fun getMovieList(): Call<MutableList<Movie>>
    fun getMovieList(): Call<Movies>
}