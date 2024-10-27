for(let x = 0; x < 5; x++) {
     console.log("GEGE");
}

x = 0;

while(x < 5) {
     console.log("quit emel");
     x++;
}

let names = ["Chib", "Corgipan", "Kc", 
             "Grabiella", "mikanik", "Juwana", "Vance"];

for(let i = 0; i < names.length; i++) {
     if(names[i] == "Vance") {
          console.log(names[i]);
          break;
     }
}


for(let i = names.length - 1; i >= 0; i--) {
     if(names[i] === "Kc") {
          console.log(names[i]);
          break;
     }
}

names = [10, 20, 30, 40, 50];

for(let z in names) {
     console.log(names[z]);
}

for(let z in names) {
     console.log(`${z}. ${names[z]}`);
}


names = ["Chib", "Corgipan", "Kc", 
         "Grabiella", "mikanik", "Juwana", "Vance"];
let i = 1;         
for(let tao of names) {
     console.log(`${i}. ${tao}`);
     i++;
}

for(let tao in names) {
     console.log(`${parseInt(tao)}. ${names[tao]}`);
}

let title = ["AOT", "DS", "Tensura", "Konosuba"];
let search = "aOT";

for(let x = 0; x < title.length; x++) {
     if(title[x].toLowerCase() === search.toLowerCase()) {
          console.log(`Found : ${title[x]}`);
          break;
     } else{
          console.log("NOT FOUND");
          break;
     }
}

title = ["AOT", "DS", "Tensura", "Konosuba"];
search = "AOt ";

for(let names in title) {
     if(title[names] === search.trim().toUpperCase()) {
          console.log(`Found : ${title[names]}`);
          break;
     } else{
          console.log("NOT FOUND");
          break;
     }
}

title = ["AOT", "DS", "Tensura", "Konosuba"];
search = "AOT";

for(let names of title) {
     if(names === search) {
          console.log(`Found : ${names}`);
          break;
     } else{
          console.log("NOT FOUND");
          break;
     }
}