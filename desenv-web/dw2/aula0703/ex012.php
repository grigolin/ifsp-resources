<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Resultado da Média</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
    <div class="container mt-5">
        <h1 class="text-center mb-4">Resultado</h1>
        <div class="card col-md-6 mx-auto p-3">
            <?php
            if ($_SERVER["REQUEST_METHOD"] == "POST") {
                // Recebendo as notas do formulário
                $nota1 = floatval($_POST['nota1']);
                $nota2 = floatval($_POST['nota2']);
                $nota3 = floatval($_POST['nota3']);
                
                // Calculando a média
                $media = ($nota1 + $nota2 + $nota3) / 3;
                
                // Determinando a situação e a cor
                if ($media < 4) {
                    $situacao = "Reprovado";
                    $cor = "text-danger"; // Vermelho
                } elseif ($media < 6) {
                    $situacao = "Recuperação";
                    $cor = "text-warning"; // Amarelo
                } else {
                    $situacao = "Aprovado";
                    $cor = "text-success"; // Verde
                }
            ?>
                <h4>Notas inseridas:</h4>
                <p>Nota 1: <?php echo $nota1; ?></p>
                <p>Nota 2: <?php echo $nota2; ?></p>
                <p>Nota 3: <?php echo $nota3; ?></p>
                <hr>
                <h4>Média: <?php echo number_format($media, 2); ?></h4>
                <h3 class="<?php echo $cor; ?>">Situação: <?php echo $situacao; ?></h3>
            <?php
            } else {
                echo "<p class='text-danger'>Erro: Nenhum dado foi enviado!</p>";
            }
            ?>
            <a href="ex01.php" class="btn btn-primary mt-3">Voltar</a>
        </div>
    </div>

    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>