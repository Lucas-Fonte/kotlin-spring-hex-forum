package com.study.hex_forum.core.useCases

import com.study.hex_forum.core.port.UserPostTemplatePort

class UserPostUseCase: UserPostTemplatePort {
    override fun getPost (): String {
        return "This is some user post"
    }
}