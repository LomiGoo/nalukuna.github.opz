// # EQUALITY BUT NOT STRICT TO DATA TYPE
let x = 10;
let y = "10";

console.log(x == y);

// # EQUALITY BUT STRICT TO DATA TYPE
x = 10;
y = 10;

console.log(x === y);

// NOT EQUAL BUT NOT STRICT TO DATA TYPE
x = 20;
y = "20";

console.log(x != y);

// NOT EQUAL BUT STRICT TO DATA TYPE
x = 20;
y = "20";

console.log(x !== y);

let genAve = 69;

if (genAve >= 75) {
     console.log("PASSED");
} else if (genAve >= 70) {
     console.log("REMEDIAL");
} else if (genAve <= 69) {
     console.log("DROPOUT");
}

grade = 100;

if (grade > 100) {
     console.log("INVALID GRADE");
} else if (grade >= 98) {
     console.log("WITH HIGHEST HONOR");
} else if (grade >= 95) {
     console.log("WITH HIGH HONOR");
} else if (grade >= 90) {
     console.log("WITH HONOR");
} else if (grade >= 75) {
     console.log("PASSED");
} else {
     console.log("FAILED");
}