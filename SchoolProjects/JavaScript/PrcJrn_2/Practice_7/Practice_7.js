/**
let isStudent = 1;
let progLang = null;
let exp = 1;

if(isStudent) {
     if(progLang.toUpperCase() === "C#") {
          if(exp >= 2) {
               console.log("Welcome to the Company!");
          }
          else {
               console.log("not enough Experience!");
          }
     }
     else {
          console.log("not a C# user!");
     }
} 
else {
     console.log("GITAWT");
}
**/

const fname = document.getElementById("fname");
const lname = document.getElementById("lname");
let age = document.getElementById("age");
const lang = document.getElementById("lang");
const submit = document.getElementById("submit");

submit.onclick = function() {
     if(!fname.value) {
          alert("YOUR FIRST NAME!");
     }
     
     else if(!lname.value) {
          alert("YOUR LAST NAME!");
     }
     
     else if(!age.value) {
          alert("YOUR AGE!");
     }
     
     else if(!lang.value) {
          alert("YOUR LANGUAGE!");
     }
     
     else if(Number(age.value) < 18) {
          alert("UNDERAGED. REJECTED, GET OUT!");
     } else {
          alert("AKALA NI BRO MAY TRABAHO NA SYA \uD83D\uDE2D\uD83D\uDE4F");
     }
     
     console.log(typeof age);
};
     
