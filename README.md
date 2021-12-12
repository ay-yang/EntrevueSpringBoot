# Java Spring Boot Test

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



