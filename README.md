# Java Spring Boot Test

## Objectif du test

Votre objectif pour ce test est de créer un API Rest avec Java et Spring Boot
pour ajouter et obtenir les détails d'un film.

Vous devez créer 2 endpoints dans l'API:

- Un GET pour obtenir un film par ID dans la base de données en mémoire (H2).
- Un POST pour ajouter un film dans la base de données en mémoire (H2).

## Critères

- 2 endpoints REST fonctionnels
- Structure des classes
- Qualité du code
- Utilisation des meilleurs pratiques

## Modèles

#### Movie

```
{
    "id": long,
    "titre": string,
    "description": string
    "acteurs": [
        {
            "id": long,
            "nom": string,
            "prenom": string
        }
    ]
}
```

Pour ajouter un film, aller vers le lien: api/film
- S'il s'agit d'une requête GET, tous les films seront retournés. 
- S'il s'agit d'une requête POST, l'objet Json sera converti en objet Movie et sera ajouté. 
- Les acteurs, s'il y en a, seront ajoutés également.

#### Actor

```
{
    "id": long,
    "movieId": long,
    "prenom": string,
    "nom": string 
}
```
Pour ajouter un acteur (sans ajouter un film), aller vers le lien: api/actor.
- S'il s'agit d'une requête GET, tous les acteurs seront retournés.
- S'il s'agit d'une requête POST, l'objet Json sera converti en objet Actor et sera ajouté.

## Endpoints

#### GET /api/film/{id}

- Requête: ID dans l'URI
- Réponse: Objet Film (Voir modèle)
- Status: 200 OK

#### POST /api/film

- Requête: Objet Film dans le body
- Réponse: Objet Film crée
- Status: 201 CREATED



