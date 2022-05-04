package com.study.hex_forum

import org.springframework.boot.test.context.SpringBootTest
import kotlin.test.Test
import kotlin.test.assertEquals

//@SpringBootTest
class HexForumApplicationTests {
	companion object {
		private const val APPLICATION_NAME = "hex_forum"
	}

	@Test
	fun testApplication() {
		assertEquals(APPLICATION_NAME, "hex_forum")
	}

}
