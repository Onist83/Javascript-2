
document.getElementById("myButton").addEventListener("click" , function() {

fetch("http://localhost:2020/all")
    .then(response => {
        // console.log(response)
        if (!response.ok) {
            throw new Error("Error in fetch");
        }
        return response.json()
    })
    .then (data => {
        console.log(data)
        for(let article of data) {
            createArticle(article);
        }
    })
    .catch(error => {
        console.log(error)
    })
})

function createArticle(article) {
    let articleDiv = document.createElement("div");
    articleDiv.textContent = article.titre + " " + article.auteur + " " + article.contenu;
    document.body.appendChild(articleDiv);
}   



// Exemple du Fletch avec exo du blog
    // Le boutton en cliquant dessus affiche les requetes demandées

// Second choix
// async function fetchArticles() {
//     try{
//         let response = await fetch("http://localhost:2020/all")
//         if(!response.ok) {
//             throw new Error("Error in fetch");
//         }
//         let data = await response.json();
//         for(let article of data) {
//             createArticle(article)
//         }
//     } catch (error) {
//         console.error(error)
//     }
// }

// fetchArticles();
// document.getElementById("myButton").addEventListener("click" , fetchArticles);
