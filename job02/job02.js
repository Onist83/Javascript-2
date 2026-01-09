let button = document.getElementById("button");

let newArticle = document.createElement("article");    
newArticle.setAttribute("id", "article") 
newArticle.textContent = "L'important n'est pas la chute, mais l'atterrissage.";

function showhide(){
    const element = document.getElementById("article");
    if (element !=  null){
    element.remove();
    }
    else {document.body.appendChild(newArticle);
    }
} 

button.addEventListener("click", showhide);



