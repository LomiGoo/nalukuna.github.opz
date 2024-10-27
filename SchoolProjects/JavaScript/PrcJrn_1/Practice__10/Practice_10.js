let SID = {
     fname : "Chevelle",
     lname : "Nacionales",
     age : 16,
     progSkills : ["Java", "JavaScript"]
};

let SID1 = Object.keys(SID); 

for(let z of SID1) {
     console.log(`${z} : ${SID[z]}`);
}

let subjects = {
     hope : 95,
     pr : 90,
     comprog1 : 93,
     comprog2 : 91,
     kompan : 84,
     ucsp : 82,
     stats : 81,
     el : 85,
     rw : 85,
     eapp : 83
};
let sum = 0;
     
let objK = Object.keys(subjects);

alert(objK.length);

for(let x in subjects) {
     console.log(`${x} : ${subjects[x]}`);
     sum += subjects[x];
}
console.log(`genAve : ${sum / objK.length}`);
