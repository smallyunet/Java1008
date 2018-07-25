// Promise

const promise = new Promise(function(resolve, reject) {
  // ... some code

  if(/* 异步操作成功 */) {
    resolve(value)
  } else {
    reject(value)
  }
})

promise.then(function(value) {
  // success
}, function(error) {
  // failure
})


// ------------------------------

function timeout(ms) {
  return new Promise((resolve, reject) => {
    setTimeout(resolve, ms, 'done')
  })
}

timeout(100).then((value) => {
  console.log(value)
})


// ------------------------------

let promise = new Promise(function(resolve, reject) {
  console.log('Promise')
  resolve()
})

promise.then(function() {
  console.log('resolved.')
})

console.log('Hi!')

// Promsie
// Hi!
// resolved

// ------------------------------

function loadImageAsync(url) {
  return new Promise(function() {
    const image = new Image()

    image.onload = function() {
      resolve(image)
    }

    image.onerror = functino() {
      reject(new Error('Could not load image at ' + url))
    }

    image.src = url
  })
}

// ------------------------------


const getJSON = function(url) {
  const promise = new Promise(function(resolve, reject) {
    const handler = function() {
      if (this.readyState !== 4) {
        return
      }
      if (this.status === 200) {
        resolve(this.response)
      } else {
        reject(new Error(this.statusText))
      }
    }
    const client = new XMLHttpRequest()
    client.open('GET', url)
    client.onreadstatechange = handler
    client.responseType = 'json'
    client.setRequestHeader('Accept', 'application/json')
    client.send()
  })

  return promise
}

getJSON('/posts.json').then(function(json) {
  console.log('Contents: ' + json)
}, function(){
  console.log('出错了',error)
})


// ------------------------------

const p1 = new Promise(function (resolve, reject) {
  // ..
})

const p2 = new Promise(function (resolve, reject) {
  // ...
  resolve(p1)
})


// ------------------------------

const p1 = new Promise(function (resolve, reject) {
  setTimeout(() => reject(new Error('fail')), 3000)
})

const p2 = new Promise(function (resolve, reject) {
  setTimeout(() => resolve(p1), 1000)
})

p2
  .then(result => console.log(result))
  .catch(error => console.log(error))

// Error:fail


// ------------------------------

new Promise((resolve, reject) => {
  resolve(1)
  console.log(2)
}).then(r => {
  console.log(r)
})

// 2
// 1

// ------------------------------

new Promise((resolve, reject) => {
  return resolve(1)
  // stop
  console.log(2)
})

