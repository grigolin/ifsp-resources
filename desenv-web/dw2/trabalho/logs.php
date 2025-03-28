<?php
session_start();

// Chave secreta
$chaveCorreta = 'senha_da_nasa';

// Verifica autenticação
if (!isset($_SESSION['autenticado'])) {
    if (isset($_POST['chave']) && $_POST['chave'] === $chaveCorreta) {
        $_SESSION['autenticado'] = true;
    } else if (isset($_POST['chave'])) {
        $erro = "Chave incorreta!";
    }
}

// Função para ler contador
function lerContador() {
    $contadorFile = 'contador.txt';
    if (!file_exists($contadorFile)) return ['index' => 0, 'sobre' => 0, 'contato' => 0];
    $contador = file($contadorFile, FILE_IGNORE_NEW_LINES | FILE_SKIP_EMPTY_LINES);
    $dados = [];
    foreach ($contador as $linha) {
        list($key, $value) = explode(':', $linha);
        $dados[$key] = (int)$value;
    }
    return $dados;
}

// Função para ler logs
function lerLogs() {
    $logFile = 'log.txt';
    if (!file_exists($logFile)) return [];
    return array_reverse(file($logFile, FILE_IGNORE_NEW_LINES | FILE_SKIP_EMPTY_LINES));
}

// Ações de limpeza
if (isset($_SESSION['autenticado']) && $_SERVER['REQUEST_METHOD'] === 'POST') {
    if (isset($_POST['limpar_tudo'])) {
        file_put_contents('contador.txt', "index:0\nsobre:0\ncontato:0\n");
        file_put_contents('log.txt', '');
    } else if (isset($_POST['limpar_index'])) {
        $dados = lerContador();
        $dados['index'] = 0;
        file_put_contents('contador.txt', "index:0\nsobre:{$dados['sobre']}\ncontato:{$dados['contato']}\n");
    } else if (isset($_POST['limpar_sobre'])) {
        $dados = lerContador();
        $dados['sobre'] = 0;
        file_put_contents('contador.txt', "index:{$dados['index']}\nsobre:0\ncontato:{$dados['contato']}\n");
    } else if (isset($_POST['limpar_contato'])) {
        $dados = lerContador();
        $dados['contato'] = 0;
        file_put_contents('contador.txt', "index:{$dados['index']}\nsobre:{$dados['sobre']}\ncontato:0\n");
    } else if (isset($_POST['limpar_logs'])) {
        file_put_contents('log.txt', '');
    } else if (isset($_POST['sair'])) {
        session_destroy();
        header('Location: logs.php');
        exit;
    }
}
?>

<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Estatísticas</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
    <nav class="navbar navbar-expand-lg bg-body-tertiary">
        <div class="container">
            <a class="navbar-brand" href="#">Estatísticas</a>
            <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav">
                <span class="navbar-toggler-icon"></span>
            </button>
            <div class="collapse navbar-collapse" id="navbarNav">
                <ul class="navbar-nav">
                    <li class="nav-item">
                        <a class="nav-link" href="index.php">Início</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="sobre.php">Sobre</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="contato.php">Contato</a>
                    </li>
                </ul>
                <ul class="navbar-nav ms-auto">
                    <?php if (isset($_SESSION['autenticado'])) { ?>
                        <li class="nav-item">
                            <form method="POST" class="d-inline">
                                <button type="submit" name="sair" class="nav-link btn btn-link">Sair</button>
                            </form>
                        </li>
                    <?php } ?>
                </ul>
            </div>
        </div>
    </nav>

    <?php if (!isset($_SESSION['autenticado'])) { ?>
        <div class="container mt-5">
            <h1>Autenticação</h1>
            <form method="POST">
                <div class="mb-3">
                    <label for="chave" class="form-label">Digite a chave de acesso:</label>
                    <input type="password" class="form-control" id="chave" name="chave" required>
                </div>
                <button type="submit" class="btn btn-primary">Entrar</button>
                <?php if (isset($erro)) echo "<p class='text-danger mt-2'>$erro</p>"; ?>
            </form>
        </div>
    <?php } else {
        $contador = lerContador();
        $logs = lerLogs();
        arsort($contador); // Ordena decrescente
        $totalAcessos = array_sum($contador);
    ?>
        <div class="container mt-4">
            <h1>Estatísticas de Acesso</h1>

            <h3>Quantidade de Acessos por Página</h3>
            <ul class="list-group mb-3">
                <?php foreach ($contador as $pagina => $qtd) { ?>
                    <li class="list-group-item"><?php echo ucfirst($pagina) . ": $qtd acessos"; ?></li>
                <?php } ?>
            </ul>
            <p><strong>Total de acessos:</strong> <?php echo $totalAcessos; ?></p>

            <h3>Limpar Contadores</h3>
            <form method="POST" class="mb-3" onsubmit="return confirm('Tem certeza que deseja limpar os contadores?');">
                            <button type="submit" name="limpar_index" class="btn btn-warning">Limpar Início</button>
                            <button type="submit" name="limpar_sobre" class="btn btn-warning">Limpar Sobre</button>
                            <button type="submit" name="limpar_contato" class="btn btn-warning">Limpar Contato</button>
                            <button type="submit" name="limpar_tudo" class="btn btn-danger">Limpar Tudo</button>
                        </form>

            <h3>Logs de Acesso</h3>
            <form method="POST" class="mb-3" onsubmit="return confirm('Tem certeza que deseja limpar os logs?');">
                            <button type="submit" name="limpar_logs" class="btn btn-danger">Limpar Logs</button>
                        </form>
            <table class="table table-striped">
                <thead>
                    <tr>
                        <th>#</th>
                        <th>Página</th>
                        <th>Data/Hora</th>
                        <th>IP</th>
                        <th>Navegador</th>
                    </tr>
                </thead>
                <tbody>
                    <?php foreach ($logs as $i => $log) {
                        $dados = explode('|', $log);
                        if (count($dados) === 4) {
                            list($pagina, $dataHora, $ip, $navegador) = $dados;
                            $contadorSeq = $i + 1;
                            echo "<tr>
                                <td>$contadorSeq</td>
                                <td>$pagina</td>
                                <td>$dataHora</td>
                                <td>$ip</td>
                                <td>" . htmlspecialchars(substr($navegador, 0, 50)) . "...</td>
                            </tr>";
                        }
                    } ?>
                </tbody>
            </table>
        </div>
    <?php } ?>

    <footer class="bg-light text-center py-3 mt-4">
        <div class="container">
            <p>Guilherme Grigolin, g.grigolin@aluno.ifsp.edu.br</p>
        </div>
    </footer>

    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
