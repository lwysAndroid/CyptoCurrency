package com.luis.tovar.cryptocurrency.data.datasources.remote.dto


import com.google.gson.annotations.SerializedName

data class CoinsResponse(
    @SerializedName("id")
    val id: String? = null,
    @SerializedName("name")
    val name: String? = null,
    @SerializedName("symbol")
    val symbol: String? = null,
    @SerializedName("rank")
    val rank: Int? = null,
    @SerializedName("is_new")
    val isNew: Boolean? = null,
    @SerializedName("is_active")
    val isActive: Boolean? = null,
    @SerializedName("type")
    val type: String? = null
)