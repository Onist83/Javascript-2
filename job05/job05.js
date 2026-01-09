// behavior: "smooth" scroll plus lent
// window.scroll()
// color HSL

let footer = document.getElementById("footer")
let monScroll = window.scrollY
// let nomDeMaVariable = maValeur dans ce cas mon Objet et son attribut

addEventListener("scroll", function() {
    console.log(window.scrollY)
}); // montre dans la console evenement du scroll dans la console

// window.addEventListener("scroll", function() { 
//     footer.style.backgroundColor = "red"
// }); // affiche le footer en red des qu'on scroll

window.addEventListener("scroll", function() {
        footer.style.backgroundColor ="hsla(" + this.window.scrollY +", 100%, 50%, 1.00)"
    

});

//0%=0 25%=1024 50%=2048 75%=3072 100%=4096
//Color 0%=0 25%=90 50%=180 75%=270 100%=360