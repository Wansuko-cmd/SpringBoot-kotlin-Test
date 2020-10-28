package com.example.setReact

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam

@Controller
class SampleController {
    @RequestMapping("/")
    fun mainController(model: Model): String{
        model.addAttribute("name", SampleModel.getModel().getName())
        return "index"
    }

    @GetMapping("/hell")
    fun getId(@RequestParam(name = "name", required = false) name: String): String{
        return "index"
    }
}