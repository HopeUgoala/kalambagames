package com.example.kalambagames.kalambaApplication;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/Games")
public class GamesController {


    private final GamesService gamesService;

    @Autowired
    public GamesController(GamesService gamesService) {

        this.gamesService = gamesService;
    }

    @PostMapping
    public void registerNewBooks(@RequestBody Games games){

        gamesService.addNewBook(games);
    }
}
