package com.example.samplesns

import kotlinx.serialization.Serializable

@Serializable
data class LoginParam(
    val loginId: String,
    val password: String
)
