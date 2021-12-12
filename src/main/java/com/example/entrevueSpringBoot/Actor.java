package com.example.entrevueSpringBoot;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Actor{
    /** FIELDS------------------------------------------------------**/
    private @Id @GeneratedValue long id; //Primary key
    private long movieId;
    private String nom;
    private String prenom;

    /**CONSTRUCTOR--------------------------------------------------**/

    public Actor() {}

    /*
     * @param prenom: actor's first name
     * @param nom: actor's last name
     * @param movieId: the id of the movie the actor plays in
     */
    public Actor(String prenom, String nom, long movieId){
        this.prenom = prenom;
        this.nom = nom;
        this.movieId = movieId;
    }

    /**METHODS------------------------------------------------------**/
    public long getId() {
        return this.id;
    }

    public long getMovieId() { return this.movieId; }

    public String getNom() {
        return this.nom;
    }

    public String getPrenom() {
        return this.prenom;
    }

    @Override
    public String toString() {
        return (" id: " + this.id +
                " titre: " + this.nom +
                " description: " + this.prenom);
    }
}