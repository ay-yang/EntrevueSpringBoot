package com.example.entrevueSpringBoot;

import java.util.List;
import java.util.ListIterator;

import org.springframework.web.bind.annotation.*;

@RestController
public class MovieController {
    private MovieRepository movieRepository;
    private ActorRepository actorRepository;

    MovieController(MovieRepository movieRepository, ActorRepository actorRepository) {
        this.movieRepository = movieRepository;
        this.actorRepository = actorRepository;
    }

    /**Mapping pertaining to movie-------------------------------------------*/
    @PostMapping("/api/film")
    public Movie newMovie(@RequestBody Movie newMovie) {
        /* List<Actor> newMovieActorList = newMovie.getActeurs();
        System.out.println(newMovieActorList);
        if (newMovieActorList != null) {
            ListIterator<Actor> newMovieActorListIterator = newMovieActorList.listIterator();
            while (newMovieActorListIterator.hasNext()) {
                Actor newActor = newMovieActorListIterator.next();
                actorRepository.save(newActor);
            }
        } */
        return movieRepository.save(newMovie);
    }

    @GetMapping("/api/film/add-by-param")
    public Movie addNewMovie(@RequestParam(value = "description", defaultValue = "Test") String description,
                      @RequestParam(value = "titre", defaultValue = "Zootopia") String titre,
                      @RequestParam(value = "id", defaultValue = "4") Long id)  {
        Movie newMovie = new Movie(description, titre, id);
        return movieRepository.save(newMovie);
    }

    @GetMapping("/api/film")
    public List<Movie> allMovies() {
        List<Movie> movieList = movieRepository.findAll();
        ListIterator<Movie> movieListIterator = movieList.listIterator();
        while (movieListIterator.hasNext()) {
            Movie currentMovie = movieListIterator.next();
            addActorsToMovie(currentMovie);
        }
        return movieList;
    }

    @GetMapping("/api/film/{id}")
    public Movie movieById(@PathVariable Long id) {
        Movie foundMovie = movieRepository.findById(id).orElseThrow( () -> new MovieNotFoundException(id));
        addActorsToMovie(foundMovie);
        return foundMovie;
    }

    private void addActorsToMovie(Movie movie) {
        List<Actor> actorList = actorRepository.findByMovieId(movie.getId());
        movie.addActors(actorList);
    }

    /**Mapping pertaining to actor--------------------------------------------*/
    @PostMapping("/api/actor")
    public Actor newActor(@RequestBody Actor newActor) {
        return actorRepository.save(newActor);
    }

    @GetMapping("/api/actor")
    public List<Actor> allActors() {
        return actorRepository.findAll();
    }

    @GetMapping("/api/actor/{id}")
    public Actor actorById(@PathVariable Long id){
        return actorRepository.findById(id).orElseThrow( () -> new ActorNotFoundException(id));
    }

}
