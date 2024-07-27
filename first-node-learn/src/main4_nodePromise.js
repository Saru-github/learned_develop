// @ts-check

const { rejects } = require('assert');
const fs = require('fs');
const { resolve } = require('path');

// 노드 프로미스
fs.readFile('.gitignore', 'utf-8', (error, value) => {
  console.log(value);
});

// 프로미스 스타일
/**
 * @param {string} filename
 */
function readFileInPromise(filename) {
  return new Promise((resolve, reject) => {
    fs.readFile(filename, 'utf-8', (error, value) => {
      if (error) {
        reject(error);
      }
      resolve(value);
    });
  });
}

// async, await, promises
async function main() {
  try {
    const result = await fs.promises.readFile('.gitignore', 'utf8');
    console.log(result);
  } catch (error) {
    console.log('error', error);
  }
}
readFileInPromise('.gitignore').then((value) => console.log(value));

main();
