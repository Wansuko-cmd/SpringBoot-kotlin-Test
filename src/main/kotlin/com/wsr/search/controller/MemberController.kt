package com.wsr.search.controller

import com.wsr.search.domains.Member
import com.wsr.search.services.MemberService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestParam

@Controller
class MemberController {
    @Autowired
    private lateinit var service: MemberService

    @GetMapping("/")
    fun index(model: Model): String{
        val members: List<Member> = service.getAll()
        model.addAttribute("members", members)
        return "index"
    }

    @GetMapping("/create")
    fun showCreateForm(): String{
        return "create"
    }

    @PostMapping("/create")
    fun create(@RequestParam("member_name") memberName: String) :String{
        val member = Member(0, memberName)
        service.add(member)
        return "redirect:/"
    }
}