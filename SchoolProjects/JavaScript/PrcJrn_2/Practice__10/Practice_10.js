const min = 1;
const max = 100;
let answer = Math.floor(Math.random() * (max - min + 1)) + min;
let running = true;
let reset = document.getElementById("reset");
let guess = document.getElementById("guess");
let play = document.getElementById("play");
let btnG = document.getElementById("btnG");
let attempt = document.getElementById("attempt");
let attempts = 0;
let display = document.getElementById("display");

