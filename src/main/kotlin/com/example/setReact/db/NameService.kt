package com.example.setReact.db

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class NameService {
    @Autowired
    private lateinit var repo: NameRepository

    fun getAll(): List<NameEntity>{
        return repo.findAll()
    }

    fun save(S: NameEntity) = repo.save(S)

    //fun getByName(name: String) = repo.findAll
}