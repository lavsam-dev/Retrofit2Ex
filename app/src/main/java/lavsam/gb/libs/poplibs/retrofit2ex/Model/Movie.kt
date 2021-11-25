package lavsam.gb.libs.poplibs.retrofit2ex.Model

import com.google.gson.annotations.SerializedName

data class Movies(
    /*
    @SerializedName("page")
    var count: Int? = null,
    @SerializedName("results")
    var results: List<Movie>? = listOf()*/
    // Pokemon делаю...
    @SerializedName("count")
    var count: Int? = null,
    @SerializedName("next")
    var next: String? = null,
    @SerializedName("previous")
    var previous: String? = null,
    @SerializedName("results")
    var results: List<Movie>? = listOf()

)

data class Movie(
    /*var page: Int = 0,
    @SerializedName("title")
    var name: String? = null,
    @SerializedName("backdrop_path")
    var url: String? = null*/
    var page: Int = 0,
    @SerializedName("name")
    var name: String? = null,
    @SerializedName("url")
    var url: String? = null
) {
    fun getImageUrl(urlPart: String?): String {
        if (urlPart == null) {
            val index = url?.split("/".toRegex())?.dropLast(1)?.last()
            return "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/$index.png"
        }
        return "http://image.tmdb.org/t/p/w500$urlPart"
    }
}
/*
Github
    @SerializedName("login")
    var name: String? = null,
    @SerializedName("avatar_url")
    var imageurl: String? = null,
    @SerializedName("type")
    var team: String? = null,
    @SerializedName("node_id")
    var createdby: String? = null

 */
/*
habr
    var name: String? = null,
    var realname: String? = null,
    var team: String? = null,
    var firstapperance: String? = null,
    var createdby: String? = null,
    var publisher: String? = null,
    var imageurl: String? = null,
    var bio: String? = null
 */