package lavsam.gb.libs.poplibs.retrofit2ex.Model

import com.google.gson.annotations.SerializedName

data class Movies(
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
    var page: Int = 0,
    @SerializedName("name")
    var name: String? = null,
    @SerializedName("url")
    var url: String? = null,
) {
    fun getImageUrl(): String {
        val index = url?.split("/".toRegex())?.dropLast(1)?.last()
        return "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/$index.png"
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