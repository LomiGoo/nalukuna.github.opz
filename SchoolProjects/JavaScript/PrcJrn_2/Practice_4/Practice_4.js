let population;
let margin;
let n;

document.getElementById("submit").onclick = function() {
     population = document.getElementById("popu").value;
     margin = document.getElementById("margin").value;
     
     population = Number(population);
     margin = Number(margin);
 
     margin = margin ** 2;
     console.log(margin);
     botmPopu = 1 + (population * margin);
     console.log(botmPopu);
     botmPopu = Number(botmPopu.toFixed(3));
     console.log(botmPopu);
     botmPopu = Number(botmPopu.toFixed(2) - 0.01 + 0.0001);
     console.log(botmPopu);
     botmPopu = Number(botmPopu.toFixed(2));
     console.log(botmPopu);
     n = population / botmPopu;

     document.getElementById("answer").textContent = 
     `n = ${n}`;
};