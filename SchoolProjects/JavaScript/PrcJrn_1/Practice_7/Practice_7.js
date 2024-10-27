let n = 0;

while(n < 5) {
     console.log("naloki");
     n++;
}

let names = ["Chevelle", "Kc", "Edviel", "Steph", "Micha"];
let i = 0;
let find = "Kc";

while(names[i]) {
     if(names[i] === find) {
          console.log(`found : ${names[i]}`);
          break;
     }
     ++i;
} if(names[i] !== find) {
     console.log("not found");
}

let z = 0;

do {
     console.log("ehh");
     z++;
} while(z < 5);






let num = [10, 20, 30, 40, 50];
i = 0;
let sum = 0;

while(num[i]) {
     sum += num[i];
     i++;
}
alert(sum);