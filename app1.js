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


const toBuy = ["potato", "pizza", "tomato"];

console.log(toBuy);
toBuy[2] = "water";
console.log(toBuy);
toBuy.push("meat");
console.log(toBuy);

const player1 = {
    name: "DY",
    age: 30,
};

console.log(player1)
player1.name = "Deayoung";
console.log(player1);
player1.sexy = "soon";
console.log(player1);


function plus1(){
    console(2+2);
}

const calculator = {
    add: function(a, b){
        console.log(a + b);
        return a + b;
    },
    minus: function(a, b){
        console.log(a - b);
        return a - b;
    },
    multiple: function(a, b){
        console.log(a * b);
        return a * b;
    },
    division: function(a, b){
        console.log(a / b);
        return a / b;
    },

    power: function(a, b){
        console.log(a ** b);
        return a ** b;
    }

};

calculator.add(5, 1);
calculator.minus(5, 1);
calculator.multiple(5, 1);
calculator.division(5, 1);
calculator.power(5, 1);

const age = 96;
function calculateKrAge(ageOfForeinger) {
    return ageOfForeinger + 2;
}

const krAge = calculateKrAge(age);

console.log('한국나이: '+krAge+'세');


const addResult = calculator.add(2, 5);
const minusResult = calculator.minus(addResult, 10);
const multipleResult = calculator.multiple(10, minusResult);
const divideResult = calculator.division(multipleResult, addResult);
const powerResult = calculator.power(divideResult, minusResult);

const age1 = parseInt(prompt("How old are you?"));

if(isNaN(age1) || age1 < 0){
    console.log("Please write a  real positive number");
} else if(age1 < 18){
    console.log("You are too young.");
} else if(age1 >= 18 && age1 <= 50) {
    console.log("You can drink");
} else if (age1 > 50 && age1 <=80){
    console.log("you should exercise");
} else if(age1 === 100){
    console.log("wow you are wise");
} else if(age > 80){
    console.log("You can do whatever you want.");
}