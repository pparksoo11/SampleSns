package com.example.data.usecase

import com.example.data.model.LoginParam
import com.example.data.retrofit.UserService
import com.example.domain.login.LoginUseCase
import javax.inject.Inject

class LoginUseCaseImpl @Inject constructor(
    private val userService: UserService
): LoginUseCase {
    override suspend fun invoke(id: String, password: String): Result<String> = runCatching {
        val reqeustBody = LoginParam(loginId = id, password = password).toRequestBody()
        userService.login(requestBody = reqeustBody).data
    }
}