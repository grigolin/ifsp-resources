<?php
require 'header.php';

session_start(); // Certifique-se de que a sessão está iniciada
?>

<div class="inicio">
    <div class="bg-light p-4 mb-4 rounded">
        <h1 class="text-center">Página inicial</h1>
    </div>

    <?php
    // Exibir mensagem da sessão, se existir
    if (isset($_SESSION['mensagem'])) {
        echo "<div class='col-md-6 mx-auto'>";
        echo "<p class='text-info text-center'>{$_SESSION['mensagem']}</p>";
        unset($_SESSION['mensagem']); // Remove a mensagem após exibir
        echo "</div>";
    }
    ?>

    <img class="img-lorem img-thumbnail m-4 rounded float-end" src="https://assets.justinmind.com/wp-content/uploads/2018/11/Lorem-Ipsum-alternatives-1024x655.png" alt="Lorem Ipsum">
    <p>
        Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nullam sit amet egestas sapien. Fusce porttitor tellus vel eleifend dictum. Aenean sed neque sit amet risus eleifend pulvinar. Aliquam erat volutpat. Duis tempor non risus sit amet accumsan. Ut eget nisl ipsum. Morbi ultrices nec mi vitae maximus. Morbi nec ornare justo. Pellentesque aliquam ex eget purus tempor sodales. In imperdiet sem nibh, eget faucibus tortor aliquam eget.
    </p>
    <p>
        Quisque imperdiet purus vel felis vulputate, quis sollicitudin enim volutpat. Curabitur elementum urna dolor. Nulla suscipit leo sit amet erat egestas commodo. Ut accumsan turpis eu justo placerat, vitae consequat ipsum suscipit. Nunc et fringilla nunc. Nullam ut lobortis nulla. Cras euismod turpis posuere sapien ornare, nec lobortis libero rhoncus. Phasellus mauris lorem, eleifend eget tincidunt quis, varius eu est. Fusce metus risus, lobortis eget justo nec, condimentum ullamcorper augue. Phasellus sollicitudin magna non euismod elementum. Proin sodales venenatis vulputate. Cras a turpis lacus. Aliquam sit amet maximus magna. Integer nec nibh ipsum. Etiam quis lacus at nisi scelerisque mattis sit amet et elit. Donec vulputate dignissim nunc id euismod.
    </p>
</div>

<?php require 'footer.php'; ?>
