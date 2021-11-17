package lavsam.gb.libs.poplibs.retrofit2ex.Model

import com.google.gson.annotations.SerializedName

data class GithubUser(
    @SerializedName("login")
    var name: String? = null,
    @SerializedName("avatar_url")
    var imageurl: String? = null,
    @SerializedName("type")
    var team: String? = null,
    @SerializedName("node_id")
    var createdby: String? = null
)