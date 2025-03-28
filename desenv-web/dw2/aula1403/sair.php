<?php
session_start();
session_destroy(); // Destroi a sessão
header("Location: index.php"); // Redireciona para a página inicial
exit;
?>