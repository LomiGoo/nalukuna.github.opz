let SID = {
     fname : "Chevelle",
     lname : "Nacionales",
     age : 16,
     progSkills : ["Html", "CSS", "JavaScript", "SQL", "Java"],
     eduGrades : {
          subjects : {
               1 : "Math - 81",
               2 : "UCSP - 84",
               3 : "Comprog - 93",
               4 : "PR - 90"
          },
     },
     favGms : {
          RPG : ["Genshin", "WUWA", "PERSONA"],
          Action : ["Monster Hunter"]
     }
     
};

console.log(SID);
console.log(SID.favGms.RPG[1]);

console.log(`
     name : ${SID.fname} S. ${SID.lname}
     age : ${SID.age}
     highest grade : ${SID.eduGrades.subjects[3]}
     fav game : ${SID.favGms.RPG[2]}
`);

SID.fname = "Kc";
console.log(SID);

SID.eyecolor = "Black";
console.log(SID);

SID.progSkills[1] = "C#";
console.log(SID);

SID.progSkills[5] = "CSS";
console.log(SID);

let strSID = JSON.stringify(SID);
console.log(strSID);

SID = JSON.parse(strSID);
console.log(SID);

let SID1 = [ 
     {
     fname : "Chevelle",
     lname : "Nacionales",
     age : 16,
     progSkills : ["Java", "Html", "CSS", "SQL", "JavaScript"]
     },
     {
     fname : "Edviel",
     lname : "Argarin",
     age : 16,
     progSkills : ["Javascript", "Html", "CSS"]
     },
     {
     fname : "Cjhay",
     lname : "Bibit",
     age : 16,
     progSkills : ["Java", "Html", "CSS"]
     }
];

for(let i = SID1.length - 1; i >= 0; i--) {
     console.log(SID1[i]);
}