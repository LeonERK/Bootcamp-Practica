document.addEventListener("DOMContentLoaded", function () {
  const likeButtons = document.querySelectorAll(".like");

  likeButtons.forEach((button) => {
    button.addEventListener("click", function () {
      const likeCountElement = this.parentElement.querySelector(".like-count");
      const currentLikes = parseInt(likeCountElement.textContent);
      likeCountElement.textContent = `${currentLikes + 1}`;
    });
  });
});
