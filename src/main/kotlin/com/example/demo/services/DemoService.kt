package com.example.demo.services

import com.example.demo.domains.DemoDomain
import com.example.demo.mappers.DemoMapper
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class DemoService {
    @Autowired
    private lateinit var mapper: DemoMapper

    fun getAll(): List<DemoDomain>{
        return mapper.findAll()
    }

    fun save(demo: String){
        mapper.save(demo)
    }
}