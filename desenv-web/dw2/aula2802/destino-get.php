<!DOCTYPE html>
<html lang="pt-BR">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Destino GET</title>
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
    // Captura os parâmetros da URL
    $nome = filter_input(INPUT_GET, "nome", FILTER_SANITIZE_SPECIAL_CHARS);
    $email = filter_input(INPUT_GET, "email", FILTER_SANITIZE_EMAIL);
    $cor = filter_input(INPUT_GET, "cor", FILTER_SANITIZE_SPECIAL_CHARS);

    // Define o background apenas se a cor foi passada
    if ($cor) {
        echo "<style>body { background-color: {$cor}; }</style>";
    }

    // Função para atualizar os parâmetros sem perder os existentes
    function atualizarQueryString($param, $valor)
    {
        $query = $_GET;
        $query[$param] = $valor;
        return "?" . http_build_query($query);
    }
    ?>
</head>

<body>
    <div class="container">
        <h1 class="my-3">Destino GET</h1>
        <hr>

        <?php
        if ($nome || $email) {
            echo "<p>Nome: {$nome}<br>Email: {$email}</p>";
            echo "<br>";
        }
        ?>

        <a
            href="<?= atualizarQueryString('nome', 'Eder') ?>&<?= atualizarQueryString('email', 'epansani@gmail.com') ?>">[nome
            = Eder | email = epansani@gmail.com]</a>
        <br><br>
        <a
            href="<?= atualizarQueryString('nome', 'Guilherme') ?>&<?= atualizarQueryString('email', 'guilherme@gui.com') ?>">[nome
            = Jose da silva | email = jose1298@outlook.com]</a>
        <br><br>
        <a href="?">Limpar tudo</a> <!-- Remove todos os parâmetros -->

        <div class="color-samples">
            <a href="<?= atualizarQueryString('cor', '#FF0000') ?>" class="color-sample color-red">
                <div class="color-name">Red</div>
                <div class="color-hex">#FF0000</div>
            </a>

            <a href="<?= atualizarQueryString('cor', '#00FF00') ?>" class="color-sample color-green">
                <div class="color-name">Green</div>
                <div class="color-hex">#00FF00</div>
            </a>

            <a href="<?= atualizarQueryString('cor', '#0000FF') ?>" class="color-sample color-blue">
                <div class="color-name">Blue</div>
                <div class="color-hex">#0000FF</div>
            </a>
        </div>

    </div>
</body>

</html>