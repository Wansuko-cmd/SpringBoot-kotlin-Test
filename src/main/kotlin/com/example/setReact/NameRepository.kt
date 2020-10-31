package com.example.setReact

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface NameRepository : JpaRepository<NameEntity, Int>{
}