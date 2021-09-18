package com.luis.tovar.cryptocurrency.data.datasources.remote.dto.coin_info


import com.google.gson.annotations.SerializedName

data class Links(
    @SerializedName("explorer")
    val explorer: List<String>? = null,
    @SerializedName("facebook")
    val facebook: List<String>? = null,
    @SerializedName("reddit")
    val reddit: List<String>? = null,
    @SerializedName("source_code")
    val sourceCode: List<String>? = null,
    @SerializedName("website")
    val website: List<String>? = null,
    @SerializedName("youtube")
    val youtube: List<String>? = null
)