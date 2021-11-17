package lavsam.gb.libs.poplibs.retrofit2ex.Model

import com.google.gson.annotations.SerializedName

data class Movie(
    @SerializedName("login")
    var name: String? = null,
    @SerializedName("avatar_url")
    var imageurl: String? = null,
    @SerializedName("type")
    var team: String? = null,
    @SerializedName("node_id")
    var createdby: String? = null
)
/*
    var name: String? = null,
    var realname: String? = null,
    var team: String? = null,
    var firstapperance: String? = null,
    var createdby: String? = null,
    var publisher: String? = null,
    var imageurl: String? = null,
    var bio: String? = null
 */