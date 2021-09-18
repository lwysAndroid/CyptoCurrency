package com.luis.tovar.cryptocurrency.data.datasources.remote.dto.coin_info


import com.google.gson.annotations.SerializedName

data class Tag(
    @SerializedName("id")
    val id: String? = null,
    @SerializedName("name")
    val name: String? = null,
    @SerializedName("coin_counter")
    val coinCounter: Int? = null,
    @SerializedName("ico_counter")
    val icoCounter: Int? = null
)