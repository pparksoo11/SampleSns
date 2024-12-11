package com.example.domain.login

interface LoginUseCase {

    suspend operator fun invoke(
        id: String,
        password: String
    ): Result<String>
}