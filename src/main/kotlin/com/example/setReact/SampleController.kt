package com.example.setReact

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping

@Controller
class SampleController {
    @RequestMapping("/")
    fun mainController(): String{
        return "index"
    }

    /*@GetMapping("/")
    fun getId(): String{
        return "Hello"
    }*/
}