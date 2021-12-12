package com.example.entrevueSpringBoot;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LoadMovieDatabase {
    private static final Logger log = LoggerFactory.getLogger(LoadMovieDatabase.class);

    @Bean
    CommandLineRunner initMovieDatabase(MovieRepository movieRepository) {
        return args -> {
            log.info("Preloading" + movieRepository.save(new Movie("A rabbit cop pairs up with a fox to " +
                    "solve a most unusual case in the city of Zootopia, home to anthropomorphic animals striving " +
                    "to live together in harmony.",
                    "Zootopia", 1)));
            log.info("Preloading" + movieRepository.save(new Movie("Darth Vader is adamant about turning " +
                     "Luke Skywalker to the dark side.",
                    "Star Wars: The Empire Strikes Back", 2)));
        };
    }
}
