package com.luis.tovar.cryptocurrency.data.datasources.remote.dto.coin_info


import com.google.gson.annotations.SerializedName

data class Whitepaper(
    @SerializedName("link")
    val link: String? = null,
    @SerializedName("thumbnail")
    val thumbnail: String? = null
)