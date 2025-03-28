<?php require 'header.php'; ?>

<div class="inicio">
    <div class="bg-light p-4 mb-4 rounded">
        <h1 class="text-center">Formulário para contato</h1>
    </div>

    <?php
    if ($_SERVER["REQUEST_METHOD"] == "POST" && isset($_POST['nome']) && isset($_POST['email']) && isset($_POST['mensagem'])) {
        $nome = htmlspecialchars($_POST['nome']);
        $email = htmlspecialchars($_POST['email']);
        $mensagem = htmlspecialchars($_POST['mensagem']);
        $dataHora = date('d/m/Y - H:i:s'); // Formato: 14/03/2025 - 14:21:50

        // Exibir os dados na tela
        echo "<div class='col-md-6 mx-auto'>";
        echo "<p><strong>Nome informado:</strong> $nome</p>";
        echo "<p><strong>E-mail:</strong> $email</p>";
        echo "<p><strong>Mensagem:</strong> $mensagem</p>";
        echo "<p><strong>Data:</strong> $dataHora</p>";
        echo "<div class='mt-4'><a href='contato.php' class='btn btn-primary'>Voltar</a></div>";
        echo "</div>";

        // Definir o caminho absoluto para a pasta 'contatos'
        $pasta = __DIR__ . '/contatos';
        
        // Criar a pasta se não existir
        if (!is_dir($pasta)) {
            if (!mkdir($pasta, 0755, true)) {
                echo "<p class='text-danger text-center mt-4'>Erro: Não foi possível criar a pasta 'contatos'. Verifique as permissões do diretório.</p>";
            } else {
                echo "<p class='text-success text-center mt-4'>Pasta 'contatos' criada com sucesso.</p>";
            }
        }

        // Nome do arquivo com base na data e hora
        $nomeArquivo = $pasta . '/contato_' . date('Ymd_His') . '.txt';
        
        // Conteúdo a ser salvo no arquivo
        $conteudo = "Nome: $nome\nE-mail: $email\nMensagem: $mensagem\nData: $dataHora\n\n";
        
        // Salvar no arquivo
        if (file_put_contents($nomeArquivo, $conteudo, FILE_APPEND) === false) {
            echo "<p class='text-danger text-center mt-4'>Erro: Não foi possível salvar o arquivo de contato.</p>";
        } else {
            echo "<p class='text-success text-center mt-4'>Dados salvos com sucesso em '$nomeArquivo'.</p>";
        }
    } else {
        echo "<div class='col-md-6 mx-auto'>";
        echo "<p class='text-danger text-center'>Nenhum dado foi enviado ou os campos estão incompletos!</p>";
        echo "<div class='mt-4'><a href='contato.php' class='btn btn-primary'>Voltar</a></div>";
        echo "</div>";
    }
    ?>
</div>

<?php require 'footer.php'; ?>