<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Destino</title>
    <script src="https://cdn.tailwindcss.com"></script>
</head>
<body class="bg-gray-100 flex items-center justify-center min-h-screen">
    <div class="bg-white p-6 rounded-lg shadow-lg w-full max-w-md">
        <h1 class="text-2xl font-bold mb-4 text-center">Destino</h1>
        
        <h2 class="text-lg font-medium mb-2">Dados da requisição:</h2>
        <pre class="bg-gray-200 p-2 rounded text-sm overflow-x-auto"><?php var_dump($_POST); ?></pre>

        <?php
        if (isset($_POST['interesses']) && is_array($_POST['interesses'])) {
            $interesses = $_POST['interesses'];
            sort($interesses); // Ordena em ordem alfabética

            echo "<h2 class='text-lg font-medium mt-4 mb-2'>Interesses selecionados (em ordem alfabética):</h2>";
            echo "<ul class='list-disc pl-5'>";
            $maxItens = min(3, count($interesses)); // Limita a 3 itens
            for ($i = 0; $i < $maxItens; $i++) {
                echo "<li>" . htmlspecialchars($interesses[$i]) . "</li>";
            }
            if (count($interesses) > 3) {
                echo "<li>...</li>";
            }
            echo "</ul>";
        } else {
            echo "<p class='text-red-500 mt-4'>Nenhum interesse selecionado.</p>";
        }
        ?>
        
        <a href="ex03.php" class="mt-4 inline-block bg-blue-500 text-white px-4 py-2 rounded hover:bg-blue-600">Voltar para o formulário</a>
    </div>
</body>
</html>