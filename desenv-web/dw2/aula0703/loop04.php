<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Praticando 4 – Gerador de tabela</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
    <div class="container mt-5">
        <h1 class="text-center mb-4">Praticando 4 – Gerador de tabela</h1>
        <form action="loop042.php" method="POST" class="col-md-6 mx-auto">
            <div class="mb-3">
                <label for="linhas" class="form-label">Linhas:</label>
                <input type="number" class="form-control" id="linhas" name="linhas" min="1" required>
            </div>
            <div class="mb-3">
                <label for="colunas" class="form-label">Colunas:</label>
                <input type="number" class="form-control" id="colunas" name="colunas" min="1" required>
            </div>
            <div class="mb-3">
                <label for="estilo" class="form-label">Estilo:</label>
                <select class="form-select" id="estilo" name="estilo" required>
                    <option value="table-primary">table-primary</option>
                    <option value="table-secondary">table-secondary</option>
                    <option value="table-success">table-success</option>
                    <option value="table-danger">table-danger</option>
                    <option value="table-warning">table-warning</option>
                    <option value="table-info">table-info</option>
                    <option value="table-light">table-light</option>
                    <option value="table-dark">table-dark</option>
                </select>
            </div>
            <div class="d-flex justify-content-between">
                <button type="submit" class="btn btn-success">Enviar</button>
                <button type="reset" class="btn btn-warning">Limpar</button>
            </div>
        </form>
    </div>

    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>