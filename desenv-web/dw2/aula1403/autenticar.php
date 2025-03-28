<?php
require 'header.php';

if (isset($_SESSION['autenticado']) && $_SESSION['autenticado'] === true) {
    $_SESSION['mensagem'] = "Você já está autenticado! Redirecionado para a página inicial.";
    header("Location: index.php");
    exit;
}

if ($_SERVER["REQUEST_METHOD"] == "POST" && isset($_POST['usuario']) && isset($_POST['senha'])) {
    $usuarioCorreto = 'grigolin';
    $senhaCorreta = '1234';

    $usuario = $_POST['usuario'];
    $senha = $_POST['senha'];

    if ($usuario === $usuarioCorreto && $senha === $senhaCorreta) {
        // Autenticação bem-sucedida
        $_SESSION['autenticado'] = true;
        $_SESSION['usuario'] = $usuario; // Armazena o nome do usuário
        header("Location: index.php");
        exit;
    } else {
        // Autenticação falhou
        echo "<div class='inicio'>";
        echo "<div class='bg-light p-4 mb-4 rounded'>";
        echo "<h1 class='text-center'>Autenticação</h1>";
        echo "</div>";
        echo "<div class='col-md-6 mx-auto'>";
        echo "<p class='text-danger text-center'>Usuário ou senha incorretos!</p>";
        echo "<div class='mt-4'><a href='entrar.php' class='btn btn-primary'>Tentar novamente</a></div>";
        echo "</div>";
        echo "</div>";
    }
} else {
    // Dados incompletos ou acesso direto
    echo "<div class='inicio'>";
    echo "<div class='bg-light p-4 mb-4 rounded'>";
    echo "<h1 class='text-center'>Autenticação</h1>";
    echo "</div>";
    echo "<div class='col-md-6 mx-auto'>";
    echo "<p class='text-danger text-center'>Por favor, preencha todos os campos!</p>";
    echo "<div class='mt-4'><a href='entrar.php' class='btn btn-primary'>Voltar</a></div>";
    echo "</div>";
    echo "</div>";
}

require 'footer.php';