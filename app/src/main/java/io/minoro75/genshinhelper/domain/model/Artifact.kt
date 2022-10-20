package io.minoro75.genshinhelper.domain.model

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Artifact(
    @Json(name = "artifact_amount")
    val artifactAmount: Int,
    @Json(name = "artifact_circlet")
    val artifactCirclet: String,
    @Json(name = "artifact_gobelet")
    val artifactGobelet: String,
    @Json(name = "artifact_name")
    val artifactName: String,
    @Json(name = "artifact_sands")
    val artifactSands: String,
    @Json(name = "artifact_url")
    val artifactUrl: String
)
