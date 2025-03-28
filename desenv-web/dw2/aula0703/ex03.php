<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Formulário de Interesses</title>
    <script src="https://cdn.tailwindcss.com"></script>
</head>
<body class="bg-gray-100 flex items-center justify-center min-h-screen">
    <div class="bg-white p-6 rounded-lg shadow-lg w-full max-w-md">
        <h1 class="text-2xl font-bold mb-4 text-center">Formulário</h1>
        <form action="ex032.php" method="POST" class="space-y-4">
            <div>
                <label class="block text-lg font-medium text-gray-700">Escolha alguns interesses:</label>
            </div>
            <div class="space-y-2">
                <!-- Categorias de Esportes -->
                <div class="flex items-center">
                    <input type="checkbox" name="interesses[]" value="Esportes" class="h-4 w-4 text-blue-600 focus:ring-blue-500 border-gray-300 rounded">
                    <label class="ml-2 text-sm text-gray-700">Esportes</label>
                </div>
                <div class="flex items-center">
                    <input type="checkbox" name="interesses[]" value="Futebol" class="h-4 w-4 text-blue-600 focus:ring-blue-500 border-gray-300 rounded">
                    <label class="ml-2 text-sm text-gray-700">Futebol</label>
                </div>
                <div class="flex items-center">
                    <input type="checkbox" name="interesses[]" value="Tênis" class="h-4 w-4 text-blue-600 focus:ring-blue-500 border-gray-300 rounded">
                    <label class="ml-2 text-sm text-gray-700">Tênis</label>
                </div>
                <div class="flex items-center">
                    <input type="checkbox" name="interesses[]" value="Basquete" class="h-4 w-4 text-blue-600 focus:ring-blue-500 border-gray-300 rounded">
                    <label class="ml-2 text-sm text-gray-700">Basquete</label>
                </div>
                <!-- Categorias de Eletrônicos -->
                <div class="flex items-center">
                    <input type="checkbox" name="interesses[]" value="Eletrônicos" class="h-4 w-4 text-blue-600 focus:ring-blue-500 border-gray-300 rounded">
                    <label class="ml-2 text-sm text-gray-700">Eletrônicos</label>
                </div>
                <div class="flex items-center">
                    <input type="checkbox" name="interesses[]" value="Smartphones" class="h-4 w-4 text-blue-600 focus:ring-blue-500 border-gray-300 rounded">
                    <label class="ml-2 text-sm text-gray-700">Smartphones</label>
                </div>
                <div class="flex items-center">
                    <input type="checkbox" name="interesses[]" value="Desktop gamers" class="h-4 w-4 text-blue-600 focus:ring-blue-500 border-gray-300 rounded">
                    <label class="ml-2 text-sm text-gray-700">Desktop gamers</label>
                </div>
                <div class="flex items-center">
                    <input type="checkbox" name="interesses[]" value="Notebooks e portáteis" class="h-4 w-4 text-blue-600 focus:ring-blue-500 border-gray-300 rounded">
                    <label class="ml-2 text-sm text-gray-700">Notebooks e portáteis</label>
                </div>
            </div>
            <div class="flex justify-between">
                <button type="submit" class="bg-blue-500 text-white px-4 py-2 rounded hover:bg-blue-600">Enviar</button>
                <button type="reset" class="bg-yellow-500 text-white px-4 py-2 rounded hover:bg-yellow-600">Limpar</button>
            </div>
        </form>
    </div>
</body>
</html>