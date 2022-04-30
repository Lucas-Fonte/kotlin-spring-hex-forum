package com.study.hex_forum.adapter.api.controllers

import com.study.hex_forum.core.port.UserPostTemplatePort
import com.study.hex_forum.core.useCases.UserPostUseCase
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/user/posts")
class UserPostController(
    private val userPostTemplatePort: UserPostTemplatePort
) {

    @GetMapping
    fun findPosts(): String {
        return userPostTemplatePort.getPost()
    }
}