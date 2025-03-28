<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Calculadora de Médias</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
    <div class="container mt-5">
        <h1 class="text-center mb-4">Calculadora de Médias</h1>
        <form action="ex012.php" method="POST" class="col-md-6 mx-auto">
            <div class="mb-3">
                <label for="nota1" class="form-label">Nota 1:</label>
                <input type="number" class="form-control" id="nota1" name="nota1" 
                       min="0" max="10" step="0.5" required>
            </div>
            <div class="mb-3">
                <label for="nota2" class="form-label">Nota 2:</label>
                <input type="number" class="form-control" id="nota2" name="nota2" 
                       min="0" max="10" step="0.5" required>
            </div>
            <div class="mb-3">
                <label for="nota3" class="form-label">Nota 3:</label>
                <input type="number" class="form-control" id="nota3" name="nota3" 
                       min="0" max="10" step="0.5" required>
            </div>
            <button type="submit" class="btn btn-primary w-100">Calcular Média</button>
        </form>
    </div>

    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>