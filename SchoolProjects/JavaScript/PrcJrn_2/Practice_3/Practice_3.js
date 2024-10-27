/**
let fname;

fname = window.prompt("First Name :");
console.log(`First Name : ${fname}`);

document.getElementById("fname").textContent = fname;

// alert(fname);

let lname = window.prompt("Last Name :");
console.log(`Last Name : ${lname}`);

console.log(`Age : ${window.prompt("Age : ")}`);
**/

let info;

document.getElementById("submit").onclick = function() {
     info = document.getElementById("firstN").value;
     document.getElementById("h1").textContent = `GETOUT, ${info}`;
}