package com.example.GameDatabase.services;

import com.example.GameDatabase.entities.Game;
import com.example.GameDatabase.repositories.GameRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * The type Game service.
 */
@Service
@Slf4j
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    /**
     * Gets all games.
     *
     * @return the all games
     * @throws Exception the exception
     */
    public List<Game> getAllGames() throws Exception {
        log.info("Getting all games in the database.");
        List<Game> games = this.gameRepository.findAll();
        if (games == null) {
            throw new Exception("Failed to get games.");
        }
        return games;
    }

    /**
     * Gets game by id.
     *
     * @param id the id
     * @return the game by id
     * @throws Exception the exception
     */
    public Game getGameById(Long id) throws Exception {
        log.info("Getting game with ID: " + id);
        Game game = this.gameRepository.findGameById(id);
        if (game == null) {
            throw new Exception("Failed to find game with ID: " + id);
        }
        return game;
    }
}
