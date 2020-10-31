package com.example.setReact

import javax.persistence.*

@Entity
@Table(name = "names")
data class NameEntity(
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private val key: Int,
        val name: String
)