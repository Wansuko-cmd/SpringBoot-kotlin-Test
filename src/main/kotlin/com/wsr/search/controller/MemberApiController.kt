package com.wsr.search.controller

import com.wsr.search.domains.Member
import com.wsr.search.services.MemberService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.ResponseBody

@Controller
class MemberApiController {
    @Autowired
    private lateinit var service: MemberService

    @GetMapping("/api/members")
    @ResponseBody
    fun all(): List<Member>{
        return service.getAll()
    }

    @GetMapping("/api/members/{words}")
    @ResponseBody
    fun find(@PathVariable words: String): List<Member>{
        return service.findByNameLike(words)
    }
}