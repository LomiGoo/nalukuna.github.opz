function dprmt1(userName_1, time) {
     console.log(`come here ${userName_1} ${time}`);
}

dprmt1("james", "out");

function add(x, y) {
     console.log(`${x} + ${y} = ${x + y}`);
}

add(12, 5);

function div(x, y) {

}

console.log(div(2, 4));

function times(x, y) {
     let num = x * y;
     return num;
}

console.log(times(5, 10));

function info(name, age) {
     console.log(`hi, ${name}. you are ${age}`);
}

info("opz", 16);

function plus(x, y) {
     let num = x + y;
     return num;
}
console.log(plus(2, 3));

function mult(x, y) {
     let num = x * y;
     return num;
}
console.log(mult(5, 5));

let a = window.prompt("num 1");
let b = window.prompt("num 2");
a = Number(a);
b = Number(b);
console.log(typeof a);
console.log(typeof b);

console.log(mult(a, b));

let x = window.prompt("plus or mult?");

if(x === "plus") {
     alert("plus confirmed");
          let y = window.prompt("num 1");
          let z = window.prompt("num 2");
               y = Number(y);
               z = Number(z);
     alert(plus(y, z));
          
} else if(x === "mult") {
     alert("mult confirmed");
          let y = window.prompt("num 1");
          let z = window.prompt("num 2");
               y = Number(y);
               z = Number(z);
     alert(mult(y, z));
}

let passw = window.prompt("password :");

function pass(pass) {
     if(passw.length >= 12) {
          return true;
     } else{
          return false;
     }
}

console.log(pass(passw));

function viceV(user, age) {
     console.log(`hi ${user}, you are ${age}`);
}

viceV("chib", 16);
viceV(16, "chib");

function even(x) {
     return x % 2 === 0 ? true : false;
}

console.log(even(4));

function test(x) {
     console.log("e");
     return;
}

test("naknam");

function test2(x) {
     if(x !== 1) {
          return console.log("nag return");
     } else {
         return console.log("nag 2nd return");
     }
}

test2(1);