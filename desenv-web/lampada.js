<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Praticando 1</title>
    <style>
        h1, h2 {
            color: white;
        }

        body {
            background-color: black;
        }

        div {
            display: flex;
            justify-content: center;
        }
    </style>
    <script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
</head>
<body>
    <h1 id="texto1">Praticando 1 - Lâmpada</h1>
    <br>
    <br>
    <div>
        <img id="lampada" src="lampada.png" alt="lampada">
    </div>
    <div>
        <h2 id="texto2">Lâmpada Apagada</h2>
    </div>
    <script>
        $(document).ready(function() {
            const $lampada = $("#lampada");
            const $body = $("body");
            const $texto1 = $("#texto1");
            const $texto2 = $("#texto2");

            // Função para acender a lâmpada
            function lampada_acesa() {
                $lampada.attr("src", "lampada-acesa.png");
                $body.css("background-color", "white"); // Define cor de fundo
                $texto1.css("color", "black"); // Altera cor do texto
                $texto2.css("color", "black").text("Lâmpada Acesa");
            }

            // Função para apagar a lâmpada
            function lampada_apagada() {
                $lampada.attr("src", "lampada.png");
                $body.css("background-color", "black"); // Restaura cor de fundo
                $texto1.css("color", "white"); // Restaura cor do texto
                $texto2.css("color", "white").text("Lâmpada Apagada");
            }

            // Eventos para mouseover e mouseout
            $lampada.on("mouseover", lampada_acesa);
            $lampada.on("mouseout", lampada_apagada);
        });
    </script>
</body>
</html>

