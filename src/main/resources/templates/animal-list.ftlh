<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>VJs Kennel</title>
    <link rel="stylesheet" href="/css/styles.css">
</head>
<body>
<h1>VJs Kennel</h1>
<br>
<br>
<ul>
    <#list dogs as dog>
        <li>
            <a href="/dogs/${dog.dogId}">${dog.name}</a>
        </li>
    </#list>
</ul>
<a href="/dogs/create">Create a New Dog</a>
</body>
</html>
