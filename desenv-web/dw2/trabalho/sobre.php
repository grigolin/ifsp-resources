<?php
// Função para atualizar contador e log
function atualizarContador($pagina) {
    $contadorFile = 'contador.txt';
    $logFile = 'log.txt';

    // Inicializa contador se não existir
    if (!file_exists($contadorFile)) {
        file_put_contents($contadorFile, "index:0\nsobre:0\ncontato:0\n");
    }

    // Lê o contador atual
    $contador = file($contadorFile, FILE_IGNORE_NEW_LINES | FILE_SKIP_EMPTY_LINES);
    $dados = [];
    foreach ($contador as $linha) {
        list($key, $value) = explode(':', $linha);
        $dados[$key] = (int)$value;
    }

    // Incrementa o contador da página atual
    $dados[$pagina]++;
    $contagem = '';
    foreach ($dados as $key => $value) {
        $contagem .= "$key:$value\n";
    }
    file_put_contents($contadorFile, $contagem);

    // Adiciona log
    $ip = $_SERVER['REMOTE_ADDR'];
    $navegador = $_SERVER['HTTP_USER_AGENT'];
    $dataHora = date('Y-m-d H:i:s');
    $log = "$pagina|$dataHora|$ip|$navegador\n";
    file_put_contents($logFile, $log, FILE_APPEND);
}

// Chama a função para atualizar o contador
atualizarContador('sobre');
?>

<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Sobre</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
    <nav class="navbar navbar-expand-lg bg-body-tertiary">
        <div class="container">
            <a class="navbar-brand" href="#">Meu Site</a>
            <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav">
                <span class="navbar-toggler-icon"></span>
            </button>
            <div class="collapse navbar-collapse" id="navbarNav">
                <ul class="navbar-nav">
                    <li class="nav-item">
                        <a class="nav-link" href="index.php">Início</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link active" href="sobre.php">Sobre</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="contato.php">Contato</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="logs.php">Logs</a>
                    </li>
                </ul>
            </div>
        </div>
    </nav>

    <div class="container mt-4">
        <h1>Sobre</h1>
        <p>Meu nome é Guilherme Grigolin!</p>
    </div>

    <footer class="bg-light text-center py-3 mt-4">
        <div class="container">
            <p>Guilherme Grigolin, g.grigolin@aluno.ifsp.edu.br</p>
        </div>
    </footer>

    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
