package edu.kit.sport.floorball.scoring.model

import jakarta.persistence.*

@Entity
data class GameEvent (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = 0,

    @Enumerated(EnumType.STRING)
    val type: GameEventType = GameEventType.Note
) {
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    lateinit var game: Game
}
