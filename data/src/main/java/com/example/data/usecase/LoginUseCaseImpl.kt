package com.example.data.usecase

import com.example.domain.login.LoginUseCase
import javax.inject.Inject

class LoginUseCaseImpl @Inject constructor(): LoginUseCase {
    override suspend fun invoke(id: String, password: String): Result<String> = runCatching {
        "token"
    }
}