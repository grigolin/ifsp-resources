<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Praticando 1 - Tabuada</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
    <div class="container mt-5">
        <h1 class="text-center mb-4">Praticando 1 – Tabuada c/ Formulário GET</h1>
        
        <!-- Formulário -->
        <form action="" method="GET" class="col-md-6 mx-auto">
            <div class="mb-3">
                <label for="valor" class="form-label">Digite um valor para a tabuada:</label>
                <input type="number" class="form-control" id="valor" name="valor" min="1" required>
            </div>
            <button type="submit" class="btn btn-primary w-100">Calcular Tabuada</button>
        </form>

        <!-- Resultado -->
        <?php
        if (isset($_GET['valor']) && is_numeric($_GET['valor'])) {
            $valor = intval($_GET['valor']);
            echo "<div class='mt-4 col-md-6 mx-auto'>";
            echo "<h3 class='text-center'>Tabuada do $valor</h3>";
            echo "<table class='table table-bordered'>";
            for ($i = 1; $i <= 10; $i++) {
                $resultado = $valor * $i;
                echo "<tr>";
                echo "<td>$valor x $i</td>";
                echo "<td>$resultado</td>";
                echo "</tr>";
            }
            echo "</table>";
            echo "</div>";
        }
        ?>
    </div>

    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>