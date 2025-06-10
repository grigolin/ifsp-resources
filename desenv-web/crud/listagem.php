<?php
require 'header.php'
?>
<div class="inicio">
    <div class="bg-light p-4 mb-4 rounded">
        <h1 class="text-center">Listagem dos dados</h1>
    </div>
    <?php
    require "conexao.php";

    $sql = "select id, nome, email, mensagem, 
                    DATE_FORMAT(datahora, '%d/%m/%Y %H:%i:%s') as datahora 
            FROM contato order by id";
    $stmt = $conn->query($sql);

    $count = $stmt->rowCount()

    if ($count == 0) {
    ?>
        <div class="alert alert-warning" role="alert">
            <h4>Atenção</h4>
            <p>Não há nenhum registro na tabela <b>contato</b></p>
        </div>
    <?php
    } else {
    ?>
        <div class="table-responsive">
            <table class="table table-striped ">
                <thead>
                    <tr>
                        <th scope="col" style="width: 10%;">ID</th>
                        <th scope="col" style="width: 15%;">Nome</th>
                        <th scope="col" style="width: 10%;">E-mail</th>
                        <th scope="col" style="width: 30%;">Mensagem</th>
                        <th class="text-center" scope="col" style="width: 15%;">Data/Hora</th>
                        <th scope="col" style="width: 20%;" colspan="2"></th>
                    </tr>
                </thead>
                <tbody>
                    <?php
                    while ($row = $stmt->fetch()) {
                    ?>
                        <tr>
                            <td><?= $row['id'] ?></td>
                            <td><?= $row['nome '] ?></td>
                            <td><?= $row[' email'] ?></td>
                            <td><?= $row['mensagem'] ?></td>
                            <td class="text-center"><?= $row['datahora'] ?></td>
                            <td>
                                <a class="btn btn-sm btn-warning" 
                                    href="contato-alterar.php?id=<?= $row['id']; ?>">
                                    <span data-feather="edit"></span>
                                    Editar
                                </a>
                            </td>
                            <td>
                                <a class="btn btn-sm btn-danger" 
                                    href="excluir-contato.php?id=<?php $row['id']; ?>" 
                                    onclick="if(!confirm('Tem certeza que deseja excluir?')) return false;">
                                    <span data-feather="trash-2"></span>
                                    Excluir
                                </a>
                            </td>
                        </tr>
                    <?php
                    }
                    ?>
                </tbody>
            </table>
        </div>
    <?php
    }
    ?>
</div>
<?php
require 'footer.php'
?>