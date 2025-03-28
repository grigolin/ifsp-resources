<?php
require 'header.php';

if (isset($_SESSION['autenticado']) && $_SESSION['autenticado'] === true) {
    $_SESSION['mensagem'] = "Você já está autenticado! Redirecionado para a página inicial.";
    header("Location: index.php");
    exit;
}
?>

<div class="inicio">
    <div class="bg-light p-4 mb-4 rounded">
        <h1 class="text-center">Entrar</h1>
    </div>

    <form action="autenticar.php" method="POST" class="col-md-6 mx-auto">
        <div class="mb-3">
            <label for="usuario" class="form-label">Usuário:</label>
            <input type="text" class="form-control" id="usuario" name="usuario" required>
        </div>
        <div class="mb-3">
            <label for="senha" class="form-label">Senha:</label>
            <input type="password" class="form-control" id="senha" name="senha" required>
        </div>
        <div class="d-flex justify-content-between">
            <button type="submit" class="btn btn-primary">Entrar</button>
            <button type="reset" class="btn btn-warning">Limpar</button>
        </div>
    </form>
</div>

<?php require 'footer.php'; ?>