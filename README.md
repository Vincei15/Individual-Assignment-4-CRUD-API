# Individual-Assignment-4-CRUD-API
# API Endpoints
#### Base URL: http://localhost:8080/dogs

### 1. Get All Dogs

   #### Method: GET

   #### URL: http://localhost:8080/dogs

#### Gets a list of all Dogs in the database

#### Response - A JSON array of Dog objects

```
[
{
"dogId": 1,
"name": "Ghost",
"description": "Loyal and playful dog",
"breed": "Pitbull",
"age": 2.0
},
{
"dogId": 2,
"name": "Duece",
"description": "Energetic loving dog",
"breed": "American Bulldog Mix",
"age": 6.0
},
{
"dogId": 3,
"name": "Rocky",
"description": "Agressive guard dog",
"breed": "Cane Corso",
"age": 4.0
}
]
```
## 2. Get Dog by ID

   #### Method: GET

   #### URL: http://localhost:8080/dogs/1


#### Response- JSON list of Dog with dogID: 1


```
{
  "dogId": 1,
  "name": "Ghost",
  "description": "Loyal and playful dog",
  "breed": "Pitbull",
  "age": 2.0
}
```


## 3. Add a New Dog

   #### Method: POST

   #### URL: http://localhost:8080/dogs

#### Request Body

```
{
"name": "Wolfy",
"description": "Friendly and energetic dog",
"breed": "Husky",
"age": 2
}
```

#### Response - The updated list of Dogs

```
[
{
"dogId": 1,
"name": "Ghost",
"description": "Loyal and playful dog",
"breed": "Pitbull",
"age": 2.0
},
{
"dogId": 2,
"name": "Duece",
"description": "Energetic loving dog",
"breed": "American Bulldog Mix",
"age": 6.0
},
{
"dogId": 3,
"name": "Rocky",
"description": "Agressive guard dog",
"breed": "Cane Corso",
"age": 4.0
},
{
"dogId": 5,
"name": "Wolfy",
"description": "Friendly and energetic dog",
"breed": "Husky",
"age": 2.0
}
]
```
## 4. Update a Dog

   #### Method: PUT

   #### URL: http://localhost:8080/dogs/1

#### Request Body:

```
   {
   "name": "Dip",
   "description": "Loyal and playful dog",
   "breed": "Pitbull",
   "age": 2
   }
```
    
#### Response- List of updated Dogs

```
[
{
"dogId": 1,
"name": "Dip",
"description": "Loyal and playful dog",
"breed": "Pitbull",
"age": 2.0
},
{
"dogId": 2,
"name": "Duece",
"description": "Energetic loving dog",
"breed": "American Bulldog Mix",
"age": 6.0
},
{
"dogId": 3,
"name": "Rocky",
"description": "Agressive guard dog",
"breed": "Cane Corso",
"age": 4.0
},
{
"dogId": 5,
"name": "Wolfy",
"description": "Friendly and energetic dog",
"breed": "Husky",
"age": 2.0
}
]
```
## 5. Delete a Dog

   #### Method: DELETE

   #### URL: http://localhost:8080/dogs/1

#### Response- Updated list of Dogs without deleted Dog

```
[
{
"dogId": 2,
"name": "Duece",
"description": "Energetic loving dog",
"breed": "American Bulldog Mix",
"age": 6.0
},
{
"dogId": 3,
"name": "Rocky",
"description": "Agressive guard dog",
"breed": "Cane Corso",
"age": 4.0
},
{
"dogId": 5,
"name": "Wolfy",
"description": "Friendly and energetic dog",
"breed": "Husky",
"age": 2.0
}
]
```

## 6. Get Dogs by Breed

   #### Method: GET

   #### URL: http://localhost:8080/dogs/breed/Husky

#### Response - List of Dogs of the requested breed

```
[
{
"dogId": 5,
"name": "Wolfy",
"description": "Friendly and energetic dog",
"breed": "Husky",
"age": 2.0
}
]
```

## 7. Search Dogs by Name

   #### Method: GET

  #### URL: http://localhost:8080/dogs/search?name=Duece

#### Response- List of Dogs with the requested name

```
[
{
"dogId": 2,
"name": "Duece",
"description": "Energetic loving dog",
"breed": "American Bulldog Mix",
"age": 6.0
}
]
```







