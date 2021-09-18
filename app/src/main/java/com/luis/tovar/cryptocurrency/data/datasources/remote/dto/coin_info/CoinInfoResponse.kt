package com.luis.tovar.cryptocurrency.data.datasources.remote.dto.coin_info


import com.google.gson.annotations.SerializedName

data class CoinInfoResponse(
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
    val type: String? = null,
    @SerializedName("tags")
    val tags: List<Tag>? = null,
    @SerializedName("team")
    val team: List<Team>? = null,
    @SerializedName("description")
    val description: String? = null,
    @SerializedName("message")
    val message: String? = null,
    @SerializedName("open_source")
    val openSource: Boolean? = null,
    @SerializedName("started_at")
    val startedAt: String? = null,
    @SerializedName("development_status")
    val developmentStatus: String? = null,
    @SerializedName("hardware_wallet")
    val hardwareWallet: Boolean? = null,
    @SerializedName("proof_type")
    val proofType: String? = null,
    @SerializedName("org_structure")
    val orgStructure: String? = null,
    @SerializedName("hash_algorithm")
    val hashAlgorithm: String? = null,
    @SerializedName("links")
    val links: Links? = null,
    @SerializedName("links_extended")
    val linksExtended: List<LinksExtended>? = null,
    @SerializedName("whitepaper")
    val whitepaper: Whitepaper? = null,
    @SerializedName("first_data_at")
    val firstDataAt: String? = null,
    @SerializedName("last_data_at")
    val lastDataAt: String? = null
)