<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Animais</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">
    <style>
        .gallery {
            display: flex;
            justify-content: center;
            gap: 20px;
            margin-bottom: 20px;
        }
        .animal-img {
            width: 200px;
            height: 200px;
            object-fit: cover;
            border: 2px solid transparent;
            cursor: pointer;
        }
        .selected {
            border: 2px solid #007bff !important;
        }
        .info-container {
            max-width: 600px;
            margin: 0 auto;
        }
    </style>
</head>
<body>
    <div class="container mt-5">
        <h1 class="text-center mb-4">Praticando 3 - Animais</h1>
        
        <!-- Galeria de imagens -->
        <div class="gallery">
            <a href="?animal=gato">
                <img src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTWni51qTFG5B38N_-eudrmp97iWhop6Xx9lw&s" alt="Gato" class="animal-img" id="gato">
            </a>
            <a href="?animal=cachorro">
                <img src="https://p2.trrsf.com/image/fget/cf/1200/1600/middle/images.terra.com/2024/07/12/1717565085-filhotes-golden-retriever.jpg" alt="Cachorro" class="animal-img" id="cachorro">
            </a>
            <a href="?animal=hamster">
                <img src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcS1MU0yyZR3udb1eJvFfPMCWF-dPU4oBrbfWw&s" alt="Hamster" class="animal-img" id="hamster">
            </a>
            <a href="?animal=lagarto">
                <img src="https://trexpets.com.br/10790-large_default/venda-de-lagarto-ameiva-legalizado.jpg" alt="Lagarto" class="animal-img" id="lagarto">
            </a>
        </div>

        <!-- Container de informações -->
        <div class="info-container card p-3">
            <?php
            session_start(); // Inicia a sessão para armazenar os cliques

            // Array para armazenar histórico de cliques
            if (!isset($_SESSION['historico'])) {
                $_SESSION['historico'] = [];
            }

            // Verifica se um animal foi clicado via GET
            if (isset($_GET['animal'])) {
                $animal = $_GET['animal'];
                // Adiciona o animal clicado ao histórico
                if (!in_array($animal, $_SESSION['historico'])) {
                    array_push($_SESSION['historico'], $animal);
                }

                // Remove duplicatas mantendo a ordem
                $_SESSION['historico'] = array_unique($_SESSION['historico']);

                // Determina a informação com base no animal
                $info = "";
                switch ($animal) {
                    case 'gato':
                        $info = "O gato é um animal doméstico conhecido por sua agilidade e independência. Vive em média 12-18 anos.";
                        break;
                    case 'cachorro':
                        $info = "O cachorro é conhecido como o melhor amigo do homem. É leal e vive em média 10-13 anos.";
                        break;
                    case 'hamster':
                        $info = "O hamster é um pequeno roedor popular como animal de estimação. Vive cerca de 2-3 anos.";
                        break;
                    case 'lagarto':
                        $info = "O lagarto é um réptil que pode mudar de cor e vive em diversos habitats. Alguns vivem até 20 anos.";
                        break;
                }

                // Exibe informações
                echo "<h4>Animal clicado: $animal</h4>";
                echo "<p>Informações: $info</p>";
                echo "<h5>Últimos:</h5>";
                $historico = array_filter($_SESSION['historico'], function($item) use ($animal) {
                    return $item !== $animal;
                });
                if (empty($historico)) {
                    echo "<p>Nenhum animal clicado antes.</p>";
                } else {
                    echo "<p>" . implode(", ", array_reverse($historico)) . "</p>";
                }
            }

            // Botão para limpar
            if (isset($_GET['limpar'])) {
                session_destroy();
                header("Location: " . $_SERVER['PHP_SELF']);
                exit;
            }
            ?>
            <button class="btn btn-danger mt-3" onclick="window.location.href='?limpar=1'">Limpar tudo</button>
        </div>
    </div>

    <script>
        // Adiciona a classe 'selected' à imagem clicada
        document.addEventListener('DOMContentLoaded', function() {
            const urlParams = new URLSearchParams(window.location.search);
            const animal = urlParams.get('animal');
            if (animal) {
                document.getElementById(animal).classList.add('selected');
            }
        });
    </script>

    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>