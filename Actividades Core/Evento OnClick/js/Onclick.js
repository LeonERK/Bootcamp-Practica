var botonCambiar = document.getElementById("Iniciar");

botonCambiar.addEventListener("click", function () {
  this.innerText = "Cerrar sesión";
});

var Eliminar = document.querySelectorAll(".btn-3");
Eliminar.forEach(function (elemento) {
  elemento.addEventListener("click", function () {
    this.remove();
  });
});

var likeButton = document.getElementById("Like-1");
if (likeButton) {
  likeButton.addEventListener("click", function () {
    alert("Le has dado me gusta a Gato Atigrado");
  });
}

var likeButton = document.getElementById("Like-2");
if (likeButton) {
  likeButton.addEventListener("click", function () {
    alert("Le has dado me gusta a Golden Retriever");
  });
}

document.querySelectorAll(".btn-1, .btn-2").forEach((button) => {
  button.addEventListener("click", function () {
    const like_count = this.querySelector(".Like-1, .Like-2");
    const current_count = parseInt(like_count.textContent);
    like_count.textContent = current_count + 1;
  });
});
