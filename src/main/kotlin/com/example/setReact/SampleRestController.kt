package com.example.setReact

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
class SampleRestController {
        @GetMapping("/hello")
        fun getName(@RequestParam(name = "name", required = false) name: String): String{
            return name
        }
    }