package com.example.demo.controller

import com.example.demo.domains.DemoDomain
import com.example.demo.services.DemoService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam

@Controller
class DemoController {
    @Autowired
    private lateinit var service: DemoService

    @RequestMapping("/")
    fun index(model: Model): String{
        val demo: List<DemoDomain> = service.getAll()
        model.addAttribute("demo", demo)
        return "index"
    }

    @GetMapping("/value")
    fun insertValue(@RequestParam(name = "demos", required = false) demos: String?, model: Model): String{
        if(demos != null) service.save(demos)
        val demo: List<DemoDomain> = service.getAll()
        model.addAttribute("demo", demo)
        return "insert"
    }
}