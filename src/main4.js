// @ts-check

/* eslint-disable no-new */
/* eslint-disable no-console */

function returnPromiseForTimeout() {
  return new Promise((resolve) => {
    setTimeout(() => {
      resolve(Math.random());
    }, 1000);
  });
}

returnPromiseForTimeout()
  .then((value) => {
    console.log(value);
    return returnPromiseForTimeout();
  })
  .then((value) => {
    console.log(value);
    return returnPromiseForTimeout();
  })
  .then((value) => {
    console.log(value);
    return returnPromiseForTimeout();
  })
  .then((value) => {
    console.log(value);
    return returnPromiseForTimeout();
  });

returnPromiseForTimeout();

/**
 * @param {number} duration
 */
function sleep(duration) {
  return new Promise((resolve) => {
    setTimeout(() => {
      resolve(undefined);
    }, duration);
  });
}

sleep(1000)
  .then((value) => {
    console.log(value);
    return sleep(1000);
  })
  .then((value) => {
    console.log(value);
    return sleep(1000);
  })
  .then((value) => {
    console.log(value);
    return sleep(1000);
  })
  .then((value) => {
    console.log(value);
    return sleep(1000);
  });

returnPromiseForTimeout();

// new Promise((resolve, reject) => {
//   console.log('Inside promise');
//   reject(new Error('First reject'));
//   console.log('Before resolve');
//   resolve('First resolve');
//   console.log('After resolve');
// })
//   .then((value) => {
//     console.log('Inside first then');
//     console.log('value', value);
//   })
//   .catch((error) => {
//     console.log('Error', error);
//   });
