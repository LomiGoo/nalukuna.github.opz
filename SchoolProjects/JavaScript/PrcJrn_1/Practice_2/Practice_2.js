let n = 100; 
let p = 0.18;
let q = 0.82;
const z = 1.96;

answer = ((p * q) / n);
answer = z * (Math.sqrt(answer));
answer1 = p - answer;
answer2 = p + answer;

console.log(answer1 + "%" + ", " + answer2 + "%");

document.getElementById("ci").innerHTML = answer1 + "%" + 
", " + answer2 + "%";

let x = 45;
x /= 2;

document.getElementById("x").innerHTML = x;

x = 50;

document.getElementById("inc-dec").innerHTML = --x;
document.getElementById("inc-dec").innerHTML = x;


const m = 81;
const cp1 = 93; 
const cp2 = 91;
const pr = 90;
const u = 84;

let genAve = m + cp1 + cp2 + pr + u;
genAve /= 5;

document.getElementById("genAve").innerHTML = genAve;

let fname = " naluki na hahaha ";
x = fname[fname.length - 11 + 1];

console.log(fname.length);
console.log(x);

x = fname.trimEnd();

console.log(x);
console.log(x.length);

let s = "naloki ka na ba or are you naloki?";
s = s.replaceAll("naloki", "nalamaw");

console.log(s);

x = fname.slice(0, 10);

console.log(x);

console.log(`solve : (50 + 50) + 100 = ${(50 + 50) + 100}`);