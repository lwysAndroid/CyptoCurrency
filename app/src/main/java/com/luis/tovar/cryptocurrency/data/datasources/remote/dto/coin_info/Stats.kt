package com.luis.tovar.cryptocurrency.data.datasources.remote.dto.coin_info


import com.google.gson.annotations.SerializedName

data class Stats(
    @SerializedName("subscribers")
    val subscribers: Int? = null,
    @SerializedName("contributors")
    val contributors: Int? = null,
    @SerializedName("stars")
    val stars: Int? = null,
    @SerializedName("followers")
    val followers: Int? = null
)