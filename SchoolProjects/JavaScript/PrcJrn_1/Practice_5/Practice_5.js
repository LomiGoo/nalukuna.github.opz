let grade = 9;
let genAve = 84;

if (grade == 10 && genAve >= 85 || grade < 10 && genAve <= 85) console.log("ENROLLED AS G11");
else console.log("NOT QUALIFIED");

let age = 18;
age = age > 18;

if (!age) console.log("GE");
else console.log("NOPE");

let bolyan = false;

alert(!bolyan);

age = 20;
EduLvl = "graduate";
let proglang = "Java";

if (age >= 20) {
     
     if (EduLvl === "graduate") {
          
          if (proglang === "Javascript") console.log("HIRED");
          else console.log("NOT HIRED");
          
          
     } else console.log("NOT HIRED");
     
     
} else console.log("not qualified");


if (age >= 20 && EduLvl === "graduate") {

     if (proglang === "Javascript") console.log("HIRED");
     else console.log("NOT HIRED");

} else console.log("NOT QUALIFIED");


age = 17;
let isRegistered = !1;

if(age >= 18 && isRegistered) console.log("VALID VOTER");
else if(age >= 18) console.log("REGISTER FIRST");

if(age < 18 && isRegistered) console.log("INVALID VOTER");
else if(age < 18) console.log("NON VOTER");


age = 17;
isRegistered = !1;

if(age >= 18) {
     
     if(isRegistered == 1) {
          console.log("VALID VOTER");
     } else {
          console.log("REGISTER FIRST");
          }
     
} else if(isRegistered == true) {  
        console.log("INVALID VOTER");
} else {
     console.log("NON VOTER");
}
