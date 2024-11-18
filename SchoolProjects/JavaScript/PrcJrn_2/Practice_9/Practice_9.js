let num = 11 + 10;

num <= 20 ? console.log("geh") : console.log("no");

let item = 100;
let money = 550;

let pay = money >= 100 ? "success" : "not enough";
console.log(pay);

let vip = true;
item = 200;


let purchase = vip ? (item - 30) : item;
console.log(`purchase $${purchase}`);

vip = "e";
let suit;

switch(true) {
     case vip :
          suit = "christmas suit";
          break;
     case !vip :
          suit = "nightmare suit";
          break;
     default :
          suit = "none";
}
console.log(suit);

let user = "cheb";

console.log(user.charAt(0));
console.log(user.lastIndexOf("e"));
console.log(user.repeat(2));
console.log(user.endsWith("b"));
console.log(user.startsWith("c"));

if(user.includes("e")) {
     console.log(1 + 1);
}

console.log(user.replaceAll("e", "i"));
console.log(user.slice(0, 3));
console.log(`${user.slice(0, 1)}${user.slice(1, 2)}${user.slice(2, 3)}${user.slice(3, 4)}`);

let fullname = "Chevelle Nacionales";
let fname = fullname.slice(0, fullname.indexOf(" "));
let lname = fullname.slice(fullname.indexOf(" ") + 1);

console.log(fname);
console.log(lname);

user = "LomiGooTakes#136743";
let halfUsr = user.slice(0, 7);
console.log(halfUsr);
halfUsr = user.slice(7, user.indexOf("#"));
console.log(halfUsr);
halfUsr = user.slice(user.indexOf("#"));
console.log(halfUsr);

//user = prompt("your name :");
console.log(user);
let storedName = user.trim().charAt(0).toUpperCase() + user.trim().slice(1).toLowerCase();
console.log(storedName);

let age = 18;
let exp = 6;

let pasok = age <= 18 && exp >= 5 ? "yes" : "no";
console.log(pasok);
/**
let paswr = false;

do {
     paswr = prompt("your password : ");
     
     if(paswr) {
          console.log("opened!");
     }
}
while(!paswr);

for(let paswr = false; !paswr;) {
     paswr = prompt("your password : ");
     
     if(paswr) {
          console.log("opened!");
     }
}
**/

for(let i = 0; i <= 10; i++) {
     if(i === 5) {
          continue;
     } else {
          console.log(i);
     }
}