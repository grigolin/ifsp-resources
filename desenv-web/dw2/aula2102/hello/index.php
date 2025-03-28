<?php
date_default_timezone_set('America/Sao_Paulo');
$name = "Guilherme";
$date = date("d-m-y");
$time = date("H:i:s");

echo "<!DOCTYPE html>
<html>
<head>
    <title>Hello World</title>
</head>
<body>
    <h1>Hello World</h1>
    <p>Nome: $name, data: $date e hora: $time</p>
    <p><a href='../guilherme/'>Hello</a></p>
</body>
</html>";
?>