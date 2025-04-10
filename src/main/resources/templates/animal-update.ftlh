<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Update Dog</title>
    <link rel="stylesheet" href="/css/styles.css">
</head>
<body>
<h1>Update Dog</h1>
<br>
<br>
<form action="/dogs/update/${dog.dogId}" method="post">
    <input type="hidden" name="dogId" value="${dog.dogId}">

    <label for="name">Name:</label>
    <input type="text" id="name" name="name" value="${dog.name}" required><br>

    <label for="description">Description:</label>
    <input type="text" id="description" name="description" value="${dog.description}" required><br>

    <label for="breed">Breed:</label>
    <input type="text" id="breed" name="breed" value="${dog.breed}"><br>

    <label for="age">Age:</label>
    <input type="number" step="any" id="age" name="age" value="${dog.age}" required><br>

    <input type="submit" value="Update Dog">
</form>
<a href="/dogs">Back to Dog List</a>
</body>
</html>
