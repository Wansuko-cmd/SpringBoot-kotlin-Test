package com.example.setReact.controller

import com.example.setReact.SampleModel
import com.example.setReact.db.NameEntity
import com.example.setReact.db.NameService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
class SampleRestController {
    @Autowired
    private lateinit var service: NameService

    @GetMapping("/hello")
    fun getName(@RequestParam(name = "name", required = false) name: String?): String{
        if(name==null) return "enter name"
        else if(service.getAll().find { it.name == name } != null) return "already exist"
        SampleModel.getModel().setName(name)
        service.save(NameEntity(0, name))
        return name
    }

    @GetMapping("/hell")
    fun getId(): String{
        return "index"
    }
}