package com.example.entrevueSpringBoot;

import java.util.List;
import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Movie {
    /** FIELDS------------------------------------------------------*/
    private @Id long id; //Primary key
    private String titre;
    private String description;
    private ArrayList<Actor> acteurs;

    /**CONSTRUCTOR--------------------------------------------------**/

    public Movie() {}

    /*
    * @param titre: title of the movie
    * @param description: description of the movie
    */
    public Movie(String description, String titre, long id) {
        this.acteurs = new ArrayList<Actor>();
        this.description = description;
        this.titre = titre;
        this.id = id;
    }

    /*
     * @param id: id of the movie
     * @param titre: title of the movie
     * @param description: description of the movie
     * @param acteurs: list of actors starring in the movie
     */
    public Movie(String description, String titre, long id, List<Actor> acteurs) {
        this.acteurs = (ArrayList<Actor>)acteurs;
        this.description = description;
        this.titre = titre;
        this.id = id;
    }

    /**METHODS------------------------------------------------------**/
    public void addActors(List<Actor> acteurs) {
        this.acteurs = (ArrayList<Actor>)acteurs;
    }

    /*Getters-------------------------------------------------------*/
    public List<Actor> getActeurs() {
        return this.acteurs;
    }

    public String getDescription() {
        return this.description;
    }

    public long getId(){
        return this.id;
    }

    public String getTitre(){
        return this.titre;
    }

    @Override
    public String toString() {
        return (" id: " + this.id +
                " titre: " + this.titre +
                " description: " + this.description +
                " acteurs: " + this.acteurs);
    }
}