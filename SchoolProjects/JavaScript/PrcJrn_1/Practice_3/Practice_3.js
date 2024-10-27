let names = ["chevelle", "Kc", "Christine"];
x = names.slice(0, 2);
alert(x);

names[names.length] = "micha";

names.push("gabriel");

alert(names.length);

x = names.slice(1, 4);

alert(x);

alert(names[2]);

alert(names[names.length - 2]);



let num = [5, 10, 15, 20];

console.log(`${num[0]} × ${num[2]} = ${num[0] * num[2]}`);

let fname = ["Chevelle", "Kc"];
let lname = ["Nacionales", "Mulano"];
let age = [16, 16];
let SID = 1;

document.getElementById("opz").innerHTML = 
`SID :       ${SID}           <br>
first name : ${fname[SID]}    <br>
last name :  ${lname[SID]}    <br>
age :        ${age[SID]}`;

let subjects = ["Filipino", "English", 
               "Mathematics", "Science", "AP", 
               "ESP", "TLE", "MAPEH"];
               
let grades = [85, 86, 78, 85, 88, 88, 90, 87];

document.getElementById("upz").innerHTML =
     `${subjects[0]} - ${grades[0]}`;
document.getElementById("upz1").innerHTML =
     `${subjects[1]} - ${grades[1]}`;
