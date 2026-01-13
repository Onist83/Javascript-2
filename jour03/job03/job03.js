function createFiltrePokemon(pokemon) {
    let pokemonP = document.createElement("p");
    pokemonP.textContent = pokemon.name.french + " " + pokemon.type ;
    document.body.appendChild(pokemonP);
}


document.getElementById("submit").addEventListener("click", function(){
    fetch("pokemon.json")
    .then(response => {
    // console.log(response);
    if (!response.ok) {
            throw new Error("Error");
        }
    return response.json();
}).then(data => {
    console.log(data);
    for( let pokemon of data) {
        createFiltrePokemon(pokemon)
    }
    
}).catch(error => {
        console.error(error)
    })
});

//  Utiliser les if
//  verifier si la partie une, puis 2 est vide ou non (Null)
if (pokemon.id = null) {
    ;
} else if (pokemon.name = null) {
    ;
} 

<li></li>