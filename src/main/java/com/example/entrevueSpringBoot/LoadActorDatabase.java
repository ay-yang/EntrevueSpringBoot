package com.example.entrevueSpringBoot;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LoadActorDatabase {
    private static final Logger actorLog = LoggerFactory.getLogger(LoadActorDatabase.class);

    @Bean
    CommandLineRunner initActorDatabase(ActorRepository actorRepository) {
        return args -> {
            actorLog.info("Preloading" + actorRepository.save(new Actor("Mark", "Hamill", 2)));
            actorLog.info("Preloading" + actorRepository.save(new Actor("Ford", "Harrison", 2)));
            actorLog.info("Preloading" + actorRepository.save(new Actor("Ginnifer", "Goodwin", 1)));
        };
    }

}
