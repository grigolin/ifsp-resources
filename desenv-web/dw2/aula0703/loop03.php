<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Praticando 3 – Números primos</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">
    <style>
        .result-box {
            display: inline-block;
            padding: 5px 10px;
            margin: 5px;
            border: 2px solid;
            border-radius: 5px;
        }
        .primo { border-color: green; background-color: #d4edda; color: green; }
        .nao-primo { border-color: red; background-color: #f8d7da; color: red; }
        .impar { border-color: green; background-color: #d4edda; color: green; }
    </style>
</head>
<body>
    <div class="container mt-5">
        <h1 class="text-center mb-4">Praticando 3 – Números primos</h1>

        <!-- Formulário -->
        <form action="" method="GET" class="col-md-6 mx-auto mb-4">
            <div class="mb-3">
                <label for="numero" class="form-label">Digite um número:</label>
                <input type="number" class="form-control" id="numero" name="numero" min="1" required>
            </div>
            <button type="submit" class="btn btn-primary w-100">Verificar</button>
        </form>

        <!-- Resultado -->
        <?php
        if (isset($_GET['numero']) && is_numeric($_GET['numero'])) {
            $numero = intval($_GET['numero']);

            // Função para verificar se um número é primo
            function isPrimo($n) {
                if ($n < 2) return false;
                for ($i = 2; $i <= sqrt($n); $i++) {
                    if ($n % $i == 0) return false;
                }
                return true;
            }

            // Verifica se é primo
            $isPrimo = isPrimo($numero) ? "é um número PRIMO" : "não é um número PRIMO";
            $primoClass = isPrimo($numero) ? "primo" : "nao-primo";

            // Verifica se é par ou ímpar
            $parImpar = ($numero % 2 == 0) ? "PAR" : "ÍMPAR";
            $imparClass = ($numero % 2 != 0) ? "impar" : "";

            echo "<div class='text-center'>";
            echo "<span class='result-box $primoClass'>O número $numero</span>";
            echo "<span class='result-box $primoClass'>$isPrimo</span>";
            if ($numero % 2 != 0) {
                echo "<span class='result-box $imparClass'>Além disso ele é um número ÍMPAR</span>";
            }
            echo "</div>";
        }
        ?>
    </div>

    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>