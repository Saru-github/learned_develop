// @ts-check
/* eslint-disable no-restricted-syntax */

const { resourceLimits } = require('worker_threads');

/**
 * @typedef person3
 *
 * @property {number} age
 * @property {string} city
 * @property {string | string[]} [pet]
 * */
/** @type {person3[]} */
const people = [
  {
    age: 20,
    city: '서울',
    pet: ['cat', 'dog'],
  },
  {
    age: 20,
    city: '대구',
  },
  {
    age: 32,
    city: '부천',
    pet: ['cat', 'dog'],
  },
  {
    age: 23,
    city: '오류',
    pet: ['cat', 'dog'],
  },
  {
    age: 20,
    city: '서울',
  },
];

function solveA() {
  /** @type {string[]} */
  const cities = [];
  for (const person3 of people) {
    if (person3.age < 30) {
      if (!cities.find((city) => person3.city === city)) {
        cities.push(person3.city);
      }
    }
  }

  return cities;
}

function solveAModern() {
  const allCities = people
    .filter((person3) => person3.age < 30)
    .map((person3) => person3.city);
  const set = new Set(allCities);
  return Array.from(set);
}

console.log('solveA: ', solveA());
console.log('solveAModern: ', solveAModern());

/** @typedef {Object.<string, Object.<string, number>>} PetsOfCities */

function solveB() {
  /** @type {PetsOfCities} */
  const result = {};

  for (const person3 of people) {
    const { city, pet: petOrPets } = person3;

    if (petOrPets) {
      // @ts-ignore
      const petsOfCity = result[city] || {};

      if (typeof petOrPets === 'string') {
        const pet = petOrPets;

        const origNumpetsOfCity = petsOfCity[pet] || 0;
        petsOfCity[pet] = origNumpetsOfCity + 1;
      } else {
        for (const pet of petOrPets) {
          const origNumpetsOfCity = petsOfCity[pet] || 0;
          petsOfCity[pet] = origNumpetsOfCity + 1;
        }
      }

      result[city] = petsOfCity;
    }
  }

  return result;
}

console.log('solveB: ', solveB());

function solveBModern() {
  return people
    .map(({ pet: petOrpets, city }) => {
      const pets =
        (typeof petOrpets === 'string' ? [petOrpets] : petOrpets) || [];
      return {
        city,
        pets,
      };
    })
    .flatMap(({ city, pets }) => pets.map((pet) => [city, pet]))
    .reduce((/** @type {PetsOfCities} */ result, [city, pet]) => {
      if (!city || !pet) {
        return result;
      }

      return {
        ...result,
        [city]: {
          ...result[city],
          [pet]: (result[pet]?.[pet] || 0) + 1,
        },
      };
    }, {});
}
console.log('solveBModern', solveBModern());
