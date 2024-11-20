package com.example.samplesns

data class LoginUiState(
    val id:String,
    val pw:String,
    val userState: UserState = UserState.NONE
)