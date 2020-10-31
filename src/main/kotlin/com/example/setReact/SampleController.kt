package com.example.setReact

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam

@Controller
class SampleController {
    @Autowired
    private lateinit var service: NameService

    @RequestMapping("/")
    fun mainController(model: Model): String{
        val test: String = service.getAll()[0].name
        model.addAttribute("name", test)
        return "index"
    }

    @GetMapping("/hell")
    fun getId(@RequestParam(name = "name", required = false) name: String): String{
        return "index"
    }
}