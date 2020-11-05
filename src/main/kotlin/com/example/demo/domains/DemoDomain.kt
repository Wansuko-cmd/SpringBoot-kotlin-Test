package com.example.demo.domains

data class DemoDomain(
        private val id: Int,
        private val demo: String
){
    fun getId(): Int{
        return id
    }

    fun getDemo(): String{
        return demo
    }
}