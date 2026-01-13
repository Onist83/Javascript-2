function createText(text) {
let textP = document.createElement("p");
    textP.textContent = text;
    document.body.appendChild(textP);
}   

document.getElementById("Button").addEventListener("click", function(){

fetch("expression.txt")
    .then(response => {
    // console.log(response);
    if (!response.ok) {
            throw new Error("Error");
        }
    return response.text();
}).then(data => {
    createText(data)
    console.log(data);
}).catch(error => {
        console.error(error)
    })

});
