document.addEventListener("DOMContentLoaded", () => {
  // Perguntar o nome do usuário
  const name = prompt("Qual é o seu nome?", "Fulano");

  if (name && name.trim() !== "") {
    document.getElementById("welcome-message").textContent = `Seja bem-vindo(a), ${name}!`;
  } else {
    document.getElementById("welcome-message").textContent = "Seja bem-vindo(a)!";
  }

  // Seleção de elementos
  const contentDiv = document.getElementById("content");
  const addButton = document.getElementById("add-paragraph");
  const removeButton = document.getElementById("remove-paragraphs");

  // Adicionar parágrafo ao clicar no botão "Adicionar Texto"
  addButton.addEventListener("click", () => {
    const paragraph = document.createElement("p");
    paragraph.textContent = "Lorem ipsum dolor sit amet, consectetur adipiscing elit.";
    paragraph.className = "paragraph";
    contentDiv.appendChild(paragraph); // Adiciona o parágrafo ao contêiner
  });

  // Remover todos os parágrafos ao clicar no botão "Remover Todos os Textos"
  removeButton.addEventListener("click", () => {
    contentDiv.innerHTML = ""; // Remove todo o conteúdo do contêiner
  });
});

