<!DOCTYPE html>
<html lang="pt-BR">
<head>
    <meta charset="UTF-8" />
    <title>Formulário de Cadastro</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet" />
</head>
<body>
    <div class="container my-4">
        <h1>Form de cadastro</h1>
        <hr />
        <div class="row">
            <div class="col-md-8">
                <form action="formcookies.php" method="post">
                    <!-- Linha 1: Nome completo e Telefone -->
                    <div class="row mb-3">
                        <div class="col-md-6">
                            <label for="nomeCompleto" class="form-label">Nome completo</label>
                            <input type="text" class="form-control" id="nomeCompleto" name="nomeCompleto" placeholder="Digite seu nome completo" required style="border: 2px solid red" oninput="updateBorder(this)" onchange="atualizarCookie('nomeCompleto', this.value)" />
                        </div>
                        <div class="col-md-6">
                            <label for="telefone" class="form-label">Telefone</label>
                            <input type="text" class="form-control" id="telefone" name="telefone" placeholder="(DD)XXXXX-XXXX" pattern="\(\d{2}\)\d{5}-\d{4}" title="O formato deve ser (DD)XXXXX-XXXX" required style="border: 2px solid red" oninput="updateBorder(this)" onchange="atualizarCookie('telefone', this.value)" />
                        </div>
                    </div>

                    <!-- Linha 2: E-mail e CPF -->
                    <div class="row mb-3">
                        <div class="col-md-6">
                            <label for="email" class="form-label">E-mail</label>
                            <input type="email" class="form-control" id="email" name="email" placeholder="Digite seu email" pattern="[a-z0-9._%+-]+@[a-z0-9.-]+\.[a-z]{2,}$" title="O formato deve ser exemplo@dominio.com" required style="border: 2px solid red" oninput="updateBorder(this)" onchange="atualizarCookie('email', this.value)" />
                        </div>
                        <div class="col-md-6">
                            <label for="cpf" class="form-label">CPF</label>
                            <input type="text" class="form-control" id="cpf" name="cpf" placeholder="XXX.XXX.XXX-XX" pattern="\d{3}\.\d{3}\.\d{3}-\d{2}" title="O formato deve ser XXX.XXX.XXX-XX" required style="border: 2px solid red" oninput="updateBorder(this)" onchange="atualizarCookie('cpf', this.value)" />
                        </div>
                    </div>

                    <!-- Linha 3: Data de Nascimento e CEP -->
                    <div class="row mb-3">
                        <div class="col-md-6">
                            <label for="dataNascimento" class="form-label">Data de Nascimento</label>
                            <input type="date" class="form-control" id="dataNascimento" name="dataNascimento" pattern="\d{4}-\d{2}-\d{2}" title="O formato deve ser AAAA-MM-DD" required style="border: 2px solid red" oninput="updateBorder(this)" onchange="atualizarCookie('dataNascimento', this.value)" />
                        </div>
                        <div class="col-md-6">
                            <label for="cep" class="form-label">CEP</label>
                            <input type="text" class="form-control" id="cep" name="cep" placeholder="XXXXX-XXX" pattern="\d{5}-\d{3}" title="O formato deve ser XXXXX-XXX" required style="border: 2px solid red" oninput="updateBorder(this)" onchange="atualizarCookie('cep', this.value)" />
                        </div>
                    </div>

                    <!-- Linha 4: Endereço e Cidade -->
                    <div class="row mb-3">
                        <div class="col-md-8">
                            <label for="endereco" class="form-label">Endereço</label>
                            <input type="text" class="form-control" id="endereco" name="endereco" placeholder="Rua, nº e bairro" required style="border: 2px solid red" oninput="updateBorder(this)" onchange="atualizarCookie('endereco', this.value)" />
                        </div>
                        <div class="col-md-4">
                            <label for="cidade" class="form-label">Cidade</label>
                            <select class="form-select" id="cidade" name="cidade" required style="border: 2px solid red" oninput="updateBorder(this)" onchange="atualizarCookie('cidade', this.value)">
                                <option value="">Selecione</option>
                                <option value="Cidade1">Cidade1</option>
                                <option value="Cidade2">Cidade2</option>
                                <option value="Cidade3">Cidade3</option>
                            </select>
                        </div>
                    </div>

                    <div class="row mb-3">
                        <div class="col-md-6">
                            <label for="fotoPerfil" class="form-label">Foto de perfil</label>
                            <input type="file" class="form-control" id="fotoPerfil" name="fotoPerfil" accept="image/*" />
                        </div>
                        <div class="col-md-6">
                            <label for="contrato" class="form-label">Contrato assinado (PDF)</label>
                            <input type="file" class="form-control" id="contrato" name="contrato" accept="application/pdf" />
                        </div>
                    </div>

                    <button type="submit" class="btn btn-primary">Cadastrar</button>
                    <button type="reset" class="btn btn-secondary" onclick="limparCookies(), resetCampos()">Limpar</button>
                </form>
            </div>

            <div class="col-md-4">
                <img src="https://pbs.twimg.com/media/GfWLtHLXIAARwSJ.jpg" alt="Avatar" class="img-fluid rounded-circle" />
            </div>
        </div>
    </div>

    <!-- Scripts -->
    <script>
        function atualizarCookie(campo, valor) {
            var xhr = new XMLHttpRequest();
            xhr.open("POST", "updatecookie.php", true);
            xhr.setRequestHeader("Content-type", "application/x-www-form-urlencoded");
            xhr.onreadystatechange = function () {
                if (xhr.readyState === 4 && xhr.status === 200) {
                    console.log("Cookie atualizado para " + campo + ": " + valor);
                }
            };
            xhr.send("campo=" + encodeURIComponent(campo) + "&valor=" + encodeURIComponent(valor));
        }

        function getCookie(nome) {
            const cookies = document.cookie.split(";");
            for (let cookie of cookies) {
                cookie = cookie.trim();
                if (cookie.startsWith(nome + "=")) {
                    return decodeURIComponent(cookie.substring(nome.length + 1));
                }
            }
            return "";
        }

        function limparCookies() {
            document.cookie.split(";").forEach(function (c) {
                document.cookie = c.trim().split("=")[0] + "=;expires=Thu, 01 Jan 1970 00:00:00 UTC;path=/";
            });
            console.log("Todos os cookies foram limpos");
        }

        function updateBorder(element) {
            if (element.type !== "file") {
                element.style.border = element.value.trim() !== "" ? "2px solid green" : "2px solid red";
            }
        }

        function resetCampos() {
            document.querySelectorAll(".form-control, .form-select").forEach(function (campo) {
                if (campo.type !== "file") {
                    campo.style.border = "2px solid red";
                }
            });
        }

        window.onload = function () {
            const campos = ["nomeCompleto", "telefone", "email", "cpf", "dataNascimento", "cep", "endereco", "cidade"];
            campos.forEach(function (campoId) {
                var elemento = document.getElementById(campoId);
                if (elemento) {
                    var valor = getCookie(campoId);
                    if (valor) {
                        elemento.value = valor;
                        updateBorder(elemento);
                    }
                }
            });
            console.log("Cookies armazenados: " + document.cookie);
        };
    </script>

    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
