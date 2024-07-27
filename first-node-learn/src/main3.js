// @ts-check


new Promise((resolve, reject) =>{

    console.log('Inside promise');
    reject(new Error('First reject'));
    resolve('First resolve');

}).then((value) => {
  console.log('Inside first then');
  console.log('value', value);
})
.catch((error) => {
  console.log('error', error);
})