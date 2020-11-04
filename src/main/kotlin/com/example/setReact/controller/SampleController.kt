package com.example.setReact.controller

import com.example.setReact.db.NameEntity
import com.example.setReact.db.NameService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping

@Controller
class SampleController {
    @Autowired
    private lateinit var service: NameService

    @GetMapping("/")
    fun index(model: Model): String{
        val members: List<NameEntity> = service.getAll()
        model.addAttribute("members", members)
        return "index"
    }
}