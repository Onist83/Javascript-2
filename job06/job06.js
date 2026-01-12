const codesKonami = ["ArrowUp","ArrowUp","ArrowDown","ArrowDown","ArrowLeft","ArrowRight","ArrowLeft","ArrowRight","b","a"];
let codesUtilisateur = [];

document.addEventListener("keydown" , event => {
    codesUtilisateur.push(event.key)
    console.log(codesUtilisateur)
    for (i = 0; i<codesUtilisateur.length; i++) {
    if (codesKonami[i]!=codesUtilisateur[i]) {
        console.log("Failed");
        codesUtilisateur = [];
    } else if (codesUtilisateur.length == codesKonami.length) {
        console.log("Password OK")
        codesUtilisateur = [];
    }
}});

// CORRECTION VERIFICATION DU TABLEAU ENTIER

// const codeKonami = ["ArrowUp","ArrowUp","ArrowDown","ArrowDown","ArrowLeft","ArrowRight","ArrowLeft","ArrowRight","b","a"];
// let codeUtilisateur = [];

// document.addEventListener("keydown" , event => {
//     codeUtilisateur.push(event.key);

//     if (codeUtilisateur.length == codeKonami.length) {
//         let Equal = true;
//         for (let i = 0; i <= codeKonami.length; i++) {
//             if (codeUtilisateur[i] != codeKonami[i]) {
//                 notEqual = false
//             }
//         }

//         if (equal) {
//             document.body.style.backgroundColor ="#0062ff";
//         }   else {
//             codeUtilisateur = []
//         }
//     }

// });


// Si l'image doit s'afficher dans le corps du document HTML, le code est : document.body.appendChild(imagejavascript).
// Si l'image est rattachée à un élément « div » de la page, le code est : div.appendChild(imagejavascript).


// push() pour remplir un tableau
// let code = codesUtilisateur.push()
