<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Create Dog</title>
    <link rel="stylesheet" href="/css/styles.css">
</head>
<body>
<h1>Create a New Dog</h1>
<br>
<br>
<form action="/dogs/new" method="post">
    <label for="name">Name:</label>
    <input type="text" id="name" name="name" required><br>

    <label for="description">Description:</label>
    <input type="text" id="description" name="description" required><br>

    <label for="breed">Breed:</label>
    <input type="text" id="breed" name="breed"><br>

    <label for="age">Age:</label>
    <input type="number" step="any" id="age" name="age" required><br>

    <input type="submit" value="Create Dog">
</form>
<a href="/dogs">Back to Dog List</a>
</body>
</html>
