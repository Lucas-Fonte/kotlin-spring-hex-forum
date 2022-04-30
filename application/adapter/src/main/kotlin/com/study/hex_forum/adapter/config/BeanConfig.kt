package com.study.hex_forum.adapter.config

import com.study.hex_forum.core.port.UserPostTemplatePort
import com.study.hex_forum.core.useCases.UserPostUseCase
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class BeanConfig {

    @Bean
    fun userPostTemplatePort(): UserPostTemplatePort = UserPostUseCase()
}