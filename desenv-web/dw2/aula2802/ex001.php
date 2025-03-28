<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title><?php echo htmlspecialchars($_POST['titulo']); ?></title>
    <style>
        body {
            background-color: <?php echo htmlspecialchars($_POST['corPlanoFundo']); ?>;
            color: <?php echo htmlspecialchars($_POST['corTexto']); ?>;
        }
    </style>
</head>
<body>
    <div class="container mt-5 text-center">
        <h1 style="font-size: 3em;"><?php echo htmlspecialchars($_POST['titulo']); ?></h1>
        <p style="font-size: 1.5em;"><?php echo nl2br(htmlspecialchars($_POST['corpo'])); ?></p>
        <?php if (!empty($_POST['urlImagem'])): ?>
            <img src="<?php echo htmlspecialchars($_POST['urlImagem']); ?>" alt="Imagem" style="max-width: 100%; height: auto;">
        <?php endif; ?>
        <?php if (!empty($_POST['urlLink'])): ?>
            <p><a href="<?php echo htmlspecialchars($_POST['urlLink']); ?>" target="_blank" style="font-size: 1.5em;"><?php echo htmlspecialchars($_POST['urlLink']); ?></a></p>
        <?php endif; ?>
    </div>
</body>
</html>