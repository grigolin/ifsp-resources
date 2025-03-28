function askUser() {
  const name = prompt("Por favor, digite seu nome:", "Fulano");

  if (name === null || name.trim() === "") {
    alert("Você cancelou ou não digitou o nome.");
    return;
  }

  const knowsJS = confirm(`Olá, ${name}! Você sabe programar em JavaScript?`);

  if (knowsJS) {
    alert(`Que ótimo, ${name}! Espero que você aprenda ainda mais!`);
  } else {
    alert(`Não tem problema, ${name}. Você irá aprender agora!`);
  }
}

