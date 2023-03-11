package edu.kit.sport.floorball.scoring.model

import jakarta.persistence.*
import java.time.Instant

@Entity
data class Game (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = 0,

    @ManyToOne(cascade = [CascadeType.ALL])
    val teamHome: Team = Team(),

    @ManyToOne(cascade = [CascadeType.ALL])
    val teamAway: Team = Team(),

    var scheduledAt: Instant = Instant.now(),
    var started: Instant = Instant.now(),

    @OneToMany(
        cascade = [CascadeType.ALL],
        orphanRemoval = true,
        mappedBy = "game"
    )
    var events: MutableList<GameEvent> = mutableListOf()
)
