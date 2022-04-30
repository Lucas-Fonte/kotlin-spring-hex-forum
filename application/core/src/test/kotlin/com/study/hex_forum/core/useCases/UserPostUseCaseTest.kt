package com.study.hex_forum.core.useCases

import kotlin.test.Test
import kotlin.test.assertEquals

class UserPostUseCaseTest {
    companion object {
        private const val DEFAULT_POST = "This is some user post"
    }
    @Test
    fun `it should return posts`() {
        val userPostUseCase = UserPostUseCase()

        assertEquals(DEFAULT_POST, userPostUseCase.getPost())
    }
}