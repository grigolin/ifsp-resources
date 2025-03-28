<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Praticando 2 – Contador</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
    <div class="container mt-5">
        <h1 class="text-center mb-4">Praticando 2 – Contador</h1>
        <form action="loop022.php" method="POST" class="col-md-6 mx-auto">
            <div class="mb-3">
                <label for="inicio" class="form-label">Início:</label>
                <input type="number" class="form-control" id="inicio" name="inicio" min="0" required>
            </div>
            <div class="mb-3">
                <label for="final" class="form-label">Final:</label>
                <input type="number" class="form-control" id="final" name="final" min="0" required>
            </div>
            <div class="mb-3">
                <label for="incremento" class="form-label">Incremento:</label>
                <input type="number" class="form-control" id="incremento" name="incremento" min="1" value="1" required>
            </div>
            <button type="submit" class="btn btn-primary w-100">Gerar Contagem</button>
        </form>
    </div>

    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>