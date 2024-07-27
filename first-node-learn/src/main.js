// Prototype
/* eslint-disable */

function Person(name) {
  this.name = name;
}
Person.prototype.greet = function greet() {
  return `Hi, ${this.name}!`;
};

function Student(name) {
  this.__proto__.constructor(name);
}

Object.setPrototypeOf(Student.prototype, Person.prototype);

Student.prototype.Study = function study() {
  return `${this.name} is studying.`;
};

const person1 = new Person('Yeonseo');
console.log(person1.greet());

const student1 = new Student('Daeyoung');
console.log(student1.Study());
