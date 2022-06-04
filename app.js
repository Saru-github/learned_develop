const daysOfWeek = ["mon","tue","wed","thu","fri","sat"];

// Get Item from Array
console.log(daysOfWeek);

// And one more day to the array
daysOfWeek.push("sun");
console.log(daysOfWeek);


const playerName = "nico";
const playerPoints = 2121321;
const playerHandsome = false;
const playerFat = "little bit";

const player = {
    name: "nico",
    points: 10,
    fat: true,
    sayHello: function(otherPesonsName){
        console.log("Hello!" + otherPesonsName + " Nice to meet you")
    },
};

console.log(player);
console.log(player.name);

console.log("Hello my name is DY");
console.log("Hello my name is WE");
console.log("Hello my name is FB");
console.log("Hello my name is EW");

function sayHello(nameOfPerson, age) {

    console.log("Hello my name is " + nameOfPerson+ "and I'm " + age);
}

console.log
sayHello("nico", 10)
sayHello("dal", 23)
sayHello("lynn", 21)

function plus(firstNumber,secondNumber){
    console.log(firstNumber + secondNumber);
}
function divide(a,b){
    console.log(a / b);
}
plus(8, 60);
divide(98, 20);

console.log(player.name)
player.sayHello("lynn")

const a = 5;
let meFat = true;
meFat = false

console.log(meFat)