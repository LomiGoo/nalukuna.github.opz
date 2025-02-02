let cars = ["honda", "BMW", "tesla", "ferrari"];

if(cars.length <= 4) {
     cars[4] = "suzuki";
}
if(cars.length <= 5) {
     cars.push("mitsubishi");
}
if(cars.length >= 5) {
     cars.pop();
}
if(cars.length >= 5) {
     cars.unshift();
}
if(cars.length >= 4) {
     cars.shift();
}

console.log(cars);

for(i = 0; i <= 5; i+=2) {
     console.log(cars[i]);
     
     if(i === 2) {
          break;
     }
}

console.log(cars.sort().reverse());

let names = ["chib", "cjhay", "stip"];
let newNames = ["edvil", "jina"];

let everyone = [...names, ...newNames];

console.log(everyone);


