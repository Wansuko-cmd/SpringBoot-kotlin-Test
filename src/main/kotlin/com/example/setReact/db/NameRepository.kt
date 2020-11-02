package com.example.setReact.db

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface NameRepository : JpaRepository<NameEntity, Int>{
}