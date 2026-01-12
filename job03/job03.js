let button = document.getElementById("button");
let compteur = document.getElementById("compteur");
let compteurNum = 1;


button.addEventListener("click", function(){
    compteur.textContent = compteurNum++
    console.log(compteurNum)

    // compteurNum++
    // compteur.textConten = compteurNum (doit commencer à 0)

});



