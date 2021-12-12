package com.example.entrevueSpringBoot;

public class MovieNotFoundException extends RuntimeException{
    public MovieNotFoundException(long id) {
        super("Could not find movie " + id);
    }
}

