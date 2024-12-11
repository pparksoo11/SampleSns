package com.example.domain.login

interface SignUpUseCase {

    suspend operator fun invoke(
        id: String,
        username: String,
        password: String
    ): Result<Unit>
}