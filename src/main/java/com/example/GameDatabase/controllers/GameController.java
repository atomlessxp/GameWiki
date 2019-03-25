package com.example.GameDatabase.controllers;

import com.example.GameDatabase.entities.Game;
import com.example.GameDatabase.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * The type Game controller.
 */
@RestController
@RequestMapping("/api")
public class GameController {

    @Autowired
    private GameService gameService;

    /**
     * Gets all games.
     *
     * @return the all games
     * @throws Exception the exception
     */
    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/")
    public List<Game> getAllGames() throws Exception {
        return this.gameService.getAllGames();
    }

    /**
     * Gets game by id.
     *
     * @param id the id
     * @return the game by id
     * @throws Exception the exception
     */
    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/{id}")
    public Game getGameById(@PathVariable Long id) throws Exception {
        return this.gameService.getGameById(id);
    }
}
