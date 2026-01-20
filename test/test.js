

const exampleModal = document.getElementById('exampleModal');
if(exampleModal){
  exampleModal.addEventListener('shown.bs.modal', event => {
    // Button that triggered the modal
    const button = event.relatedTarget; 
    // Extract info from data-bs-* attributes
    const recipient = button.getAttribute('data-bs-whatever'); 
    // If necessary, you could initiate an AJAX request here
    // and then do the updating in a callback.

    //update the model's content
    const modalTitle = exampleModal.querySelector('input');
    const modalDiscription = exampleModal.querySelector('.modal-body textarea');

    modalTitle.textContent = New Task title to ${recipient};
    modalBodyInput.value = recipient;
  })
}