package com.wsr.search.mappers

import com.wsr.search.domains.Member
import org.apache.ibatis.annotations.Insert
import org.apache.ibatis.annotations.Mapper
import org.apache.ibatis.annotations.Select

@Mapper
interface MemberMapper {
    @Select("SELECT * FROM members")
    fun all(): List<Member>

    @Select("SELECT * FROM members WHERE name LIKE '%' || #{words} || '%'")
    fun findByNameLike(words: String): List<Member>

    @Insert("INSERT INTO members(name) VALUES (#{name})")
    fun add(member: Member)
}