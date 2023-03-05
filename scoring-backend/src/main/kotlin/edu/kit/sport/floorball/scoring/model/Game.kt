package edu.kit.sport.floorball.scoring.model

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id

@Entity
data class Game (@Id @GeneratedValue(strategy = GenerationType.IDENTITY) val id: Long? = null)
