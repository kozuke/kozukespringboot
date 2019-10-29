package com.kozuke.kozukespringboot.business.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
class TestController {

    @GetMapping("hello")
    fun hello(@RequestParam("name") name: String): String = "Hello, $name!"
}