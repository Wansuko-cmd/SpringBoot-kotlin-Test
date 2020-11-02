package com.example.setReact.controller

import com.example.setReact.db.NameService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.RequestMapping

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
}