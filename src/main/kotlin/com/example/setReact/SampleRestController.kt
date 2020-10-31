package com.example.setReact

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import javax.naming.Name

@RestController
class SampleRestController {
    @Autowired
    private lateinit var service: NameService

    @GetMapping("/hello")
    fun getName(@RequestParam(name = "name", required = false) name: String): String{
        SampleModel.getModel().setName(name)
        service.save(NameEntity(0, name))
        return name
    }
}