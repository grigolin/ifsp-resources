<?php
require 'header.php';

if (!isset($_SESSION['autenticado']) || $_SESSION['autenticado'] !== true) {
    header("Location: entrar.php");
    exit;
}
?>

<div class="inicio">
    <div class="bg-light p-4 mb-4 rounded">
        <h1 class="text-center">Perfil</h1>
    </div>

    <div class="col-md-6 mx-auto">
        <p class="text-center">Bem-vindo, <?php echo htmlspecialchars($_SESSION['usuario'] ?? 'Usuário'); ?>!</p>
        <div class="mt-4 text-center">
            <a href="index.php" class="btn btn-primary">Voltar</a>
        </div>
    </div>
</div>

<?php require 'footer.php'; ?>