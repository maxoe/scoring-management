package edu.kit.sport.floorball.scoring.repository

import edu.kit.sport.floorball.scoring.model.Game
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface GamesRepository : CrudRepository<Game, String>
