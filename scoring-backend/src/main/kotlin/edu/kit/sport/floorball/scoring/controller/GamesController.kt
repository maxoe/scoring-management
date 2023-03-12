package edu.kit.sport.floorball.scoring.controller

import edu.kit.sport.floorball.scoring.model.Game
import edu.kit.sport.floorball.scoring.repository.GamesRepository
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*


@RestController
@RequestMapping("/games")
class GamesController(
    private val gamesRepository: GamesRepository
) {

    @GetMapping
    fun getAllGames(): ResponseEntity<List<Game>> {
        return ResponseEntity.ok(gamesRepository.findAll().toList())
    }

    @PostMapping
    fun createGame(@RequestBody newGame: Game): ResponseEntity<Long> {
        return try {
            ResponseEntity.status(HttpStatus.CREATED).body(
                gamesRepository.save(newGame).id
            )
        } catch (e: IllegalArgumentException) {
            ResponseEntity.status(HttpStatus.BAD_REQUEST).build()
        }
    }

    @GetMapping("/{id}")
    fun getGame(@PathVariable id: String): ResponseEntity<Game> {
        val game = gamesRepository.findById(id)
        return if (game.isEmpty) {
            ResponseEntity.notFound().build()
        } else {
            ResponseEntity.ok(gamesRepository.findById(id).get())
        }
    }

    @PutMapping("/{id}")
    fun updateGame(@RequestBody newGame: Game, @PathVariable id: String): ResponseEntity<Game> {
        return ResponseEntity.status(HttpStatus.NOT_IMPLEMENTED).build()
    }

    @DeleteMapping("/{id}")
    fun deleteGame(@PathVariable id: String): ResponseEntity<Void> {
        try {
            gamesRepository.deleteById(id)
        } catch (e: IllegalArgumentException) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build()
        }

        return  ResponseEntity.ok().build()
    }
}