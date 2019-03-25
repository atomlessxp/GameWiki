package com.example.GameDatabase.repositories;

import com.example.GameDatabase.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * The interface Game repository.
 */
@Repository
public interface GameRepository extends JpaRepository<Game, Long> {

    /**
     * Find game by id game.
     *
     * @param id the id
     * @return the game
     */
    Game findGameById(Long id);
}
