let textarea = document.getElementById("keylogger")


addEventListener("keydown", function(event){
    console.log(event.key)
    if (event.key >='a' && event.key <='z'){
    textarea.value = textarea.value + event.key;
    }
    // textarea.value += event.key   idem que ligne 7
});





// utilise addEventListener("keydown", function(event) {(code)};
// evenement type keydown
// accede aux textearea content avec .value