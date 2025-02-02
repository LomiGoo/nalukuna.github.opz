let display = document.getElementById("display");
let attempt = document.getElementById("attempt");
let guess = document.getElementById("guess");
let btnG = document.getElementById("btnG");
let play = document.getElementById("play");
let reset = document.getElementById("reset");
let running = false;
// let min = 1;
// let max = 100;
// let answer = Math.floor(Math.random() * (max - min + 1)) + min;
let user;

let x = window.prompt("nigga enter ur numba");
console.log(x);

btnG.onclick = function() {
     if(running === false) {
          attempt.textContent = "start game first!";
     }
};

play.onclick = function() {
     running = true;
     cntAttmpt = 0;
     const min = 1;
     const max = 100;
     let answer = Math.floor(Math.random() * (max - min + 1)) + min;
     play.disabled = true;
     console.log(answer);
     
btnG.onclick = function() {
          if(running === true) {
          user = Number(guess.value);
          if(user < min || user > max) {
               attempt.textContent = "invalid";
               } else if(user < answer) {
                    cntAttmpt++;
                    attempt.textContent = `too low, attempt : ${cntAttmpt}`;
               } else if(user > answer) {
                    cntAttmpt++;
                    attempt.textContent = `too high, attempt : ${cntAttmpt}`;
               } else{
                    cntAttmpt++;
                    attempt.textContent = `congrats! attempts : ${cntAttmpt}`;
                    display.textContent = answer;
                    btnG.disabled = true;
               }
          } else {
               attempt.textContent = "start new!";
          }
     };
};

reset.onclick = function() {
     running = false;
     console.log(running === false ? "yes" : "no");
     attempt.textContent = "PRESS play first!";
     display.textContent = "???";
     cntAttmpt = 0;
     play.disabled = false;
     btnG.disabled = false;
     guess.value = "";
};
