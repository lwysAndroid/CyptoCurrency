package com.luis.tovar.cryptocurrency.data.datasources.remote.dto.coin_info


import com.google.gson.annotations.SerializedName

data class LinksExtended(
    @SerializedName("url")
    val url: String? = null,
    @SerializedName("type")
    val type: String? = null,
    @SerializedName("stats")
    val stats: Stats? = null
)