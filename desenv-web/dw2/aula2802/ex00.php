<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Formulário</title>
    <link href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
    <div class="container mt-5">
        <h1>Formulário</h1>
        <form method="POST" action="ex001.php">
            <div class="form-group">
                <label for="titulo">Título da página</label>
                <input type="text" class="form-control" id="titulo" name="titulo">
            </div>
            <div class="form-group">
                <label for="corpo">Corpo</label>
                <textarea class="form-control" id="corpo" name="corpo" rows="3"></textarea>
            </div>
            <div class="form-group">
                <label for="corTexto">Cor do texto</label>
                <input type="color" class="form-control" id="corTexto" name="corTexto">
            </div>
            <div class="form-group">
                <label for="urlImagem">URL de uma imagem</label>
                <input type="url" class="form-control" id="urlImagem" name="urlImagem">
            </div>
            <div class="form-group">
                <label for="urlLink">URL de link</label>
                <input type="url" class="form-control" id="urlLink" name="urlLink">
            </div>
            <div class="form-group">
                <label for="corPlanoFundo">Cor de plano de fundo da página</label>
                <input type="color" class="form-control" id="corPlanoFundo" name="corPlanoFundo">
            </div>
            <button type="submit" class="btn btn-primary">Enviar</button>
            <button type="submit" class="btn btn-warning">Enviar</button>
        </form>
    </div>
    <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.5.4/dist/umd/popper.min.js"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</body>
</html>