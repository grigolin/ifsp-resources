<?php
require 'header.php'
?>

<div class="inicio">
    <div class="bg-light p-4 mb-4 rounded">
        <h1 class="text-center">Formulário para contato</h1>
    </div>

    <div class="row">
        <div class="col-8 offset-2">
            <form class="row g-3" action="destino-contato.php" method="POST">
                <div class="col-6">
                    <div class="mb-2">
                        <label for="nome">Nome:</label>
                        <input class="form-control" type="text" name="nome" id="nome" required autofocus>
                    </div>
                </div>
                <div class="col-6">
                    <div class="mb-2">
                        <label for="email">E-mail</label>
                        <input class="form-control" type="email" id="email" placeholder="Digite seu email" required>
                    </div>
                </div>
                <div class="col-12">
                    <div class="mb-2">
                        <label for="email">Mensagem</label>
                        <textarea class="form-control" name="msg" id="msg" cols="30" rows="3" required></textarea>
                    </div>
                </div>

                <div class="col-12 text-center">
                    <button type="button" class="btn btn-primary">Enviar</button>
                    <button type="reset" class="btn btn-warning">Limpar</button>
                </div>
            </form>
        </div>
    </div>
</div>

<?php
require 'footer.php'
?>