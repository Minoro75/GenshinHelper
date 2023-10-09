package io.minoro75.genshinhelper.domain.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Artifact(
    @SerialName("artifact_amount")
    val artifactAmount: Int,
    @SerialName("artifact_circlet")
    val artifactCirclet: String,
    @SerialName("artifact_gobelet")
    val artifactGobelet: String,
    @SerialName("artifact_name")
    val artifactName: String,
    @SerialName("artifact_sands")
    val artifactSands: String,
    @SerialName("artifact_url")
    val artifactUrl: String
)
