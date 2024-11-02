/**
let x = 100;
console.log(Math.round(x));
console.log(Math.floor(x));
console.log(Math.ceil(x));
console.log(Math.trunc(x));
console.log(Math.pow(x, 2));
console.log(Math.sqrt(x));
console.log(Math.log(x));
console.log(Math.abs(x));

x = 10;
let y = 20;
let z = 30;
console.log(Math.max(x, y, z));
console.log(Math.min(x, y, z));
**/
let min = 1;
let max = 6;



let i = 0;
while(i <= 1) {
     let roll = Math.floor(Math.random() * max) + min;
     console.log(roll);
     i++;
}

for(i = 0; i <= 1; i++) {
     let roll = Math.floor(Math.random() * max) + min;
     console.log(roll);
} 

let roll = document.getElementById("roll");
let reset = document.getElementById("reset");
let dice = document.getElementById("dice");

min = 1;
max = 47;

roll.onclick = function() {
     roll = Math.floor(Math.random() * max) + min;
     dice.textContent = roll;
     
     if(roll === 3) {
          alert("hule");
     }
};

reset.onclick = function() {
     dice.textContent = 1;
};
