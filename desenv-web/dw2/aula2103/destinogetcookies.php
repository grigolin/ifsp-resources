<!DOCTYPE html>
<html lang="pt-BR">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Destino Cookies</title>
    <style>
        body {
            margin: 0;
            padding: 0;
        }

        .container {
            width: 80%;
            margin: 0 auto;
            padding: 20px;
        }

        .my-3 {
            margin-top: 1rem;
            margin-bottom: 1rem;
        }

        hr {
            border: 0;
            border-top: 1px solid #ddd;
            margin: 20px 0;
        }

        a {
            color: #0066cc;
            text-decoration: none;
        }

        a:hover {
            text-decoration: underline;
        }

        p {
            line-height: 1.5;
        }

        .color-samples {
            display: flex;
            justify-content: space-between;
            margin: 30px 0;
            flex-wrap: wrap;
        }

        .color-sample {
            width: 30%;
            height: 200px;
            border: 2px solid #000;
            margin-bottom: 20px;
            position: relative;
            display: flex;
            flex-direction: column;
            justify-content: flex-end;
            padding: 10px;
            box-sizing: border-box;
            color: white;
            cursor: pointer;
        }

        .color-red {
            background-color: #FF0000;
        }

        .color-green {
            background-color: #00FF00;
        }

        .color-blue {
            background-color: #0000FF;
        }

        .color-name {
            font-weight: bold;
            font-size: 18px;
        }

        .color-hex {
            font-size: 14px;
            margin-top: 5px;
        }
    </style>

    <?php
    // Processa os parâmetros da URL e define cookies
    if (isset($_GET['nome'])) {
        $nome = filter_input(INPUT_GET, "nome", FILTER_SANITIZE_SPECIAL_CHARS);
        setcookie('nome', $nome, time() + (86400 * 30), "/"); // Cookie válido por 30 dias
    } else {
        $nome = isset($_COOKIE['nome']) ? $_COOKIE['nome'] : '';
    }

    if (isset($_GET['email'])) {
        $email = filter_input(INPUT_GET, "email", FILTER_SANITIZE_EMAIL);
        setcookie('email', $email, time() + (86400 * 30), "/");
    } else {
        $email = isset($_COOKIE['email']) ? $_COOKIE['email'] : '';
    }

    if (isset($_GET['cor'])) {
        $cor = filter_input(INPUT_GET, "cor", FILTER_SANITIZE_SPECIAL_CHARS);
        setcookie('cor', $cor, time() + (86400 * 30), "/");
    } else {
        $cor = isset($_COOKIE['cor']) ? $_COOKIE['cor'] : '';
    }

    // Define o background apenas se a cor foi definida
    if ($cor) {
        echo "<style>body { background-color: {$cor}; }</style>";
    }

    // Função para criar URL com novos valores
    function criarLinkCookie($nome = null, $email = null, $cor = null) {
        $params = [];
        if ($nome !== null) $params['nome'] = $nome;
        if ($email !== null) $params['email'] = $email;
        if ($cor !== null) $params['cor'] = $cor;
        return "?" . http_build_query($params);
    }
    ?>
</head>

<body>
    <div class="container">
        <h1 class="my-3">Destino Cookies</h1>
        <hr>

        <?php
        if ($nome || $email) {
            echo "<p>Nome: {$nome}<br>Email: {$email}</p>";
            echo "<br>";
        }
        ?>

        <a href="<?= criarLinkCookie('Eder', 'epansani@gmail.com') ?>">[nome = Eder | email = epansani@gmail.com]</a>
        <br><br>
        <a href="<?= criarLinkCookie('Guilherme', 'guilherme@gui.com') ?>">[nome = Guilherme | email = guilherme@gui.com]</a>
        <br><br>
        <a href="?limpar=1">Limpar tudo</a>

        <?php
        // Limpa os cookies se o parâmetro limpar estiver presente
        if (isset($_GET['limpar'])) {
            setcookie('nome', '', time() - 3600, "/");
            setcookie('email', '', time() - 3600, "/");
            setcookie('cor', '', time() - 3600, "/");
            header("Location: ?");
            exit;
        }
        ?>

        <div class="color-samples">
            <a href="<?= criarLinkCookie(null, null, '#FF0000') ?>" class="color-sample color-red">
                <div class="color-name">Red</div>
                <div class="color-hex">#FF0000</div>
            </a>

            <a href="<?= criarLinkCookie(null, null, '#00FF00') ?>" class="color-sample color-green">
                <div class="color-name">Green</div>
                <div class="color-hex">#00FF00</div>
            </a>

            <a href="<?= criarLinkCookie(null, null, '#0000FF') ?>" class="color-sample color-blue">
                <div class="color-name">Blue</div>
                <div class="color-hex">#0000FF</div>
            </a>
        </div>
    </div>
</body>

</html>
