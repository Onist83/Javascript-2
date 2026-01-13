const json = `{
    "prenom" :"Tanguy", 
    "ville" : "Toulon",
    "job" : "Apprenti Dev" 
}`;
console.log(JSON.parse(json));

function jsonValueKey(stringJSON, cle) {
    let formatedJson = JSON.parse(stringJSON);
    return formatedJson[cle];
}

console.log(jsonValueKey(json, "job"))