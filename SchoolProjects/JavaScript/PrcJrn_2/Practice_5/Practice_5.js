const incr = document.getElementById("next");
const decr = document.getElementById("back");
const reset = document.getElementById("reset");
const num = document.getElementById("num");
let add = 0;

incr.onclick = function() {
     ++add;
     num.textContent = add;
};