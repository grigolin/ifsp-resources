<?php
if (isset($_POST['campo']) && isset($_POST['valor'])) {
    $campo = $_POST['campo'];
    $valor = $_POST['valor'];
    setcookie($campo, $valor, time() + 8600, "/");
    echo "Cookie '{$campo}' atualizado com valor '{$valor}'";
} else {
    echo "Dados não enviados";
}
?>
