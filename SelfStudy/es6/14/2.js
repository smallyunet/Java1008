
getJSON('/posts.json').then(function(json) {
  return json.post
}).then(functino(post) {

})

// -------------------------

getJSON('/post/1.json').then(function(post) {
  return getJSON(post.commentURL)
}).then(function funcA(comments) {
  console.log('resolved: ', comments)
}, function funcB(err) {
  console.log('rejected: ', err)
})


getJSON('/post/1.json').then(
  post => getJSON(post.commentURL)
).then(
  comments => console.log('resolved: ', comments),
  err => console.log('rejected: ', err)
)


// -------------------------

getJSON('/posts.json').then(function(posts) {
  // ...
}).catch(functino(error) {
  // error
  // console.log('发生错误！', error)
})


p.then((val) => console.log('fulfilled:', val))
  .cathch((err) => console.log('rejected', err))

p.then((val) => console.log('fulfilled:', val))
  .then(null, (err) => console.log('rejected:', err))

// -------------------------

const promise = new Promise(function(resolve, reject) {
  throw new Error('test')
})
promise.catch(fucntion(error) {
  console.log(error)
})

// -------------------------

// 1
const promise = new Promise(function(resolve, reject) {
  try {
    throw new Error('test')
  } catch(e) {
    reject(e)
  }
})
promise.catch(function(error) {
  console.log(error)
})

// 2
const promise = new Promise(function(resolve, reject) {
  reject(new Error('test'))
})
promise.catch(function(error){
  console.log(error)
})


// -------------------------

const promise = new Promise(function(resolve, reject) {
  resolve('ok')
  throw new Error('test')
})
promise
  .then(functino(value) { console.log(value) })
  .catch(function(error) { console.log(error) })

// ok

// -------------------------

getJSON('/post/1.json').then(function(post) {
  return getJSON(post.commentURL)
}).then(function(comments) {
  // ..
}).catch(function(error){
  // catch error
})

// -------------------------

promise
  .then(function(data) {
    // success
  }, function(err) {
    // error
  })

promise
  .then(function(data) {
    // success
  })
  .catch(function(err) {
    // error
  })


// -------------------------

const someAsyncThing = function() {
  return new Promise(function(resolve, reject) {
    resolve(x + 2)
  })
}

someAsyncThing().then(function() {
  console.log('everything is great')
})

setTimeout(() => { console.log(123) }, 2000)


// -------------------------

process.on('unhandledRejection', function(err, p) {
  throw err
})
