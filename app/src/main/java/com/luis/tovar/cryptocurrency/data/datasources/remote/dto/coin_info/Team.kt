package com.luis.tovar.cryptocurrency.data.datasources.remote.dto.coin_info


import com.google.gson.annotations.SerializedName

data class Team(
    @SerializedName("id")
    val id: String? = null,
    @SerializedName("name")
    val name: String? = null,
    @SerializedName("position")
    val position: String? = null
)