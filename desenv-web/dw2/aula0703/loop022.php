<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Praticando 2 – Contagem</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
    <div class="container mt-5">
        <h1 class="text-center mb-4">Praticando 2 – Contagem</h1>
        
        <?php
        if ($_SERVER["REQUEST_METHOD"] == "POST" && isset($_POST['inicio']) && isset($_POST['final']) && isset($_POST['incremento'])) {
            $inicio = intval($_POST['inicio']);
            $final = intval($_POST['final']);
            $incremento = intval($_POST['incremento']);

            // Validação básica
            if ($incremento <= 0) {
                echo "<p class='text-danger text-center'>Erro: O incremento deve ser maior que zero!</p>";
            } else {
                echo "<h3 class='text-center'>Contagem de $inicio até $final (incremento de $incremento):</h3>";
                echo "<ul class='list-group list-group-flush col-md-6 mx-auto'>";
                
                if ($inicio <= $final) {
                    // Contagem crescente
                    for ($i = $inicio; $i <= $final; $i += $incremento) {
                        echo "<li class='list-group-item'>$i</li>";
                    }
                } else {
                    // Contagem decrescente
                    for ($i = $inicio; $i >= $final; $i -= $incremento) {
                        echo "<li class='list-group-item'>$i</li>";
                    }
                }
                echo "</ul>";
            }
        } else {
            echo "<p class='text-danger text-center'>Nenhum dado foi enviado ou os campos estão incompletos!</p>";
        }
        ?>

        <div class="text-center mt-4">
            <a href="loop02.php" class="btn btn-primary">Voltar</a>
        </div>
    </div>

    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>