package edu.kit.sport.floorball.scoring.controller

import edu.kit.sport.floorball.scoring.model.Game
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*


@RestController
@RequestMapping("/games")
class GamesController() {

    @GetMapping
    fun getAllGames(): ResponseEntity<List<Game>> {
        return ResponseEntity.status(HttpStatus.NOT_IMPLEMENTED).build()
    }

    @PostMapping
    fun createGame(@RequestBody newGame: Game): ResponseEntity<Game> {
        return ResponseEntity.status(HttpStatus.NOT_IMPLEMENTED).build()
    }

    @GetMapping("/{id}")
    fun getGame(@PathVariable id: Long): ResponseEntity<Game> {
        return ResponseEntity.status(HttpStatus.NOT_IMPLEMENTED).build()
    }

    @PutMapping("/{id}")
    fun updateGame(@RequestBody newGame: Game, @PathVariable id: Long): ResponseEntity<Game> {
        return ResponseEntity.status(HttpStatus.NOT_IMPLEMENTED).build()
    }

    @DeleteMapping("/{id}")
    fun deleteGame(@PathVariable id: Long): ResponseEntity<Void> {
        return ResponseEntity.status(HttpStatus.NOT_IMPLEMENTED).build()
    }
}