const incr = document.getElementById("next");
const decr = document.getElementById("back");
const reset = document.getElementById("reset");
const num = document.getElementById("num");
const enter = document.getElementById("enter");
let add = 0;

incr.onclick = function() {
     ++add;
     num.textContent = add;
     
     if(add === 4) {
          alert("limit");
               alert("eys");
     }
     
     if(add === 3) {
          enter.addEventListener("click", function() {
               location.href = "/Genshin_Store.html";
          });
     

     }
     console.log(typeof add);
};

decr.onclick = function() {
     --add;
     num.textContent = add;
};

reset.onclick = function() {
     add = 0;
     num.textContent = add;
};

