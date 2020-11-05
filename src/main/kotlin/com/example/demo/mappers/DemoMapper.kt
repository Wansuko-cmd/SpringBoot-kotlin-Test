package com.example.demo.mappers

import com.example.demo.domains.DemoDomain
import org.apache.ibatis.annotations.Insert
import org.apache.ibatis.annotations.Mapper
import org.apache.ibatis.annotations.Select

@Mapper
interface DemoMapper{
    @Select("select * from Demos")
    fun findAll(): List<DemoDomain>

    @Insert("insert into Demos (demo) values (#{demo})")
    fun save(demo: String)
}