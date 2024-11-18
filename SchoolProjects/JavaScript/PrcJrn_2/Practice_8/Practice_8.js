let ans1 = document.getElementById("ans1");
let ans2 = document.getElementById("ans2");
let btn = document.getElementById("btn");
let p = document.getElementById("p");

btn.onclick = function() {
     if(ans1.checked) {
          alert("GITAWT");
     } else if(ans2.checked) {
          alert("gud");
     } else if(!ans1.checked) {
          alert("choose one answer!");
     } else if(!ans2.checked) {
          alert("choose one answer!");
     }
};

