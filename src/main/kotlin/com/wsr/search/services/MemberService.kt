package com.wsr.search.services

import com.wsr.search.domains.Member
import com.wsr.search.mappers.MemberMapper
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class MemberService {
    @Autowired
    private lateinit var mapper: MemberMapper
    fun getAll(): List<Member>{
        return mapper.all()
    }

    fun findByNameLike(words: String): List<Member>{
        return mapper.findByNameLike(words)
    }

    fun add(member: Member){
        mapper.add(member)
    }
}