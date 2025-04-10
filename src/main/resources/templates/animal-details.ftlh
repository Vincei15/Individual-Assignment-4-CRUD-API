<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>${dog.name}</title>
    <link rel="stylesheet" href="/css/styles.css">
</head>
<body>
<h1>${dog.name}</h1>
<br>
<br>
<p><strong>Breed:</strong> ${dog.breed}</p>
<p><strong>Age:</strong> ${dog.age}</p>
<p><strong>Description:</strong> ${dog.description}</p>
<a href="/dogs">Back to Dog List</a>
<a href="/dogs/update/${dog.dogId}">Edit Dog</a>
<a href="/dogs/delete/${dog.dogId}">Delete Dog</a>
</body>
</html>
