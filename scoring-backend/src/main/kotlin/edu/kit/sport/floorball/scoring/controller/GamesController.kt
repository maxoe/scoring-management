package edu.kit.sport.floorball.scoring.controller

import edu.kit.sport.floorball.scoring.model.Game
import org.springframework.web.bind.annotation.*


@RestController
@RequestMapping("/games")
class GamesController() {

    @GetMapping("/")
    fun getAllGames(): List<Game> {
        // TODO
        return emptyList()
    }
    @PostMapping("/create")
    fun createGame(@RequestBody newGame: Game): Game {
        // TODO
        return Game()
    }

    @GetMapping("/games/{id}")
    fun getGame(@PathVariable id: Long): Game {
        // TODO
        return Game()
    }

    @PutMapping("/games/{id}")
    fun updateGame(@RequestBody newGame: Game, @PathVariable id: Long): Game {
        // TODO
        return Game()
    }

    @DeleteMapping("/games/{id}")
    fun deleteGame(@PathVariable id: Long) {
        // TODO
    }
}