// let newForm = document.createElement("formulaire");    
// newForm.setAttribute("id", "formulaire") 
// newForm.(...)Content = "(formulaire)";

// function showhide(){
//     const element = document.getElementById("formulaire");
//     if (element !=  null){
//     element.remove();
//     }
//     else {document.body.appendChild(newForm);
//     }
// } 

// button.addEventListener("click", showhide);

// const myModal = document.getElementById('myModal')
// const myInput = document.getElementById('myInput')

// myModal.addEventListener('shown.bs.modal', () => {
//     myInput.focus()
// })


// const closeButton = document.querySelector(".buttonSecondary");

// function closeButtonSecondary() {
//     let dialog = document.getElementById("createTaskDialog");
//     dialog.close();
// }
// closeButton.addEventListener("click", () => {
// dialog.closeButtonSecondary();
// });

// Exemple button close
const openDialog = document.querySelector(".open-dialog");
openDialog.addEventListener("click", () => {
  dialog.showModal();
  result.textContent = "";
});

const dialog = document.querySelector(".example-dialog");
dialog.addEventListener("close", (event) => {
  result.textContent = "La boîte de dialogue a été fermée";
});


// const openDialog = document.querySelector(".openDialogButton");
// openDialog.addEventListener("click", () => {
//     dialog.showModal();
//     result.textContent = "";
// });

// const dialog = document.querySelector(".createTaskDialog");
// dialog.addEventListener("close", (event) => {
//     result.textContent = "";
// })