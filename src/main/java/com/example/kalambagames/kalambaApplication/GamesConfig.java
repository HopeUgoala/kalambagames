package com.example.kalambagames.kalambaApplication;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class GamesConfig {

    @Bean
    CommandLineRunner commandLineRunner(
            GamesRepository repository) {
        return args -> {
            Games winterRun = new Games(
                    "Hope",
                    "Kill"
            );
            repository.saveAll(
                    List.of(winterRun)
            );
        };

    }
}

