<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Praticando 4 – Tabela Gerada</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">
    <style>
        /* Ensure table cells are visible even when empty */
        .custom-table td {
            min-width: 50px; /* Minimum width to ensure cells are visible */
            height: 40px; /* Height to make cells visible */
            text-align: center; /* Center the "-" in each cell */
        }
    </style>
</head>
<body>
    <div class="container mt-5">
        <h1 class="text-center mb-4">Praticando 4 – Gerador de tabela</h1>
        
        <?php
        if ($_SERVER["REQUEST_METHOD"] == "POST" && isset($_POST['linhas']) && isset($_POST['colunas']) && isset($_POST['estilo'])) {
            $linhas = intval($_POST['linhas']);
            $colunas = intval($_POST['colunas']);
            $estilo = htmlspecialchars($_POST['estilo']);

            // Validação básica
            if ($linhas < 1 || $colunas < 1) {
                echo "<p class='text-danger text-center'>Erro: Linhas e colunas devem ser maiores que zero!</p>";
            } else {
                echo "<h3 class='text-center'>Tabela {$linhas}x{$colunas}</h3>";
                echo "<div class='col-md-8 mx-auto'>";
                echo "<table class='table $estilo table-bordered custom-table'>";
                for ($i = 0; $i < $linhas; $i++) {
                    echo "<tr>";
                    for ($j = 0; $j < $colunas; $j++) {
                        echo "<td>-</td>";
                    }
                    echo "</tr>";
                }
                echo "</table>";
                echo "</div>";
            }
        } else {
            echo "<p class='text-danger text-center'>Nenhum dado foi enviado ou os campos estão incompletos!</p>";
        }
        ?>

        <div class="text-center mt-4">
            <a href="loop04.php" class="btn btn-primary">Voltar</a>
        </div>
    </div>

    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>