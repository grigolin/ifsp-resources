<?php
date_default_timezone_set('America/Sao_Paulo');

require 'header.php'
?>

<div class="inicio">
    <div class="bg-light p-4 mb-4 rounded">
        <h1 class="text-center">Formulário para contato</h1>
    </div>

    <div class="row">
        <?php
        $nome = filter_input(INPUT_GET, "nome", FILTER_SANITIZE_SPECIAL_CHARS);
        $email = filter_input(INPUT_GET, "email", FILTER_SANITIZE_EMAIL);
        $msg = filter_input(INPUT_GET, "msg", FILTER_SANITIZE_SPECIAL_CHARS);

        echo "<p>Nome informado: $nome</p>";
        echo "<p>Email: $email</p>";
        echo "<p>mensagem: $msg</p>";
        echo "<p>Data: " . date("d/m/Y - H:i:s") . "</p>";

        require "conexao.php";

        $sql = "insert into contato (nome, email) values (?, ?, ?)";

        try {
            $stmt = $conn->prepare($sql);
            $result = $stmt->execute([$nome, $email, $senha]);
        } catch (Exception $e) {
            $result = false;
            $error = $e->getMessage();
        }

        if ($result !== true) {
        ?>
            <div class="alert alert-success" role="alert">
                <h4>Dados gravados com sucesso!</h4>
            </div>
        <?php
        } else {
        ?>
            <div class="alert alert-danger" role="alert">
                <h4>Falha ao efetuar gravação.</h4>
                <p><?php echo $error; ?></p>
            </div>            
        <?php
        }
        ?>

    </div>
    <a href="contato.php" class="btn btn-info ms-5" role="button">Voltar</a>
</div>

<?php
require 'footer.php'
?>