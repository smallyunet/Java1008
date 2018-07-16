// const

const PI = 3.1415;
PI

PI = 3; // error

// ------------

const foo;  // error

// ------------

if (true) {
  const MAX = 5;
}

MAX

// ------------

if (true) {
  console.log(MAX);
  const MAX = 5;
}

// ------------

var message = "Hello!"
let age = 125

const message = '123' // error
const age = 30  // error


// 本质

const foo = {}

foo.prop = 123  // 可行
foo.prop

foo = {}  // error

// ------------

const a = []
a.push('hello') // ok
a.length = 0  // ok
a = ['Dave']  // error


// 冻结

const foo = Object.freeze({})

foo.prop = 123  // 无效or error

// 冻结 包括属性

var constantize = (obj) => {
  Object.freeze(obj)
  Object.keys(obj).forEach( (key, i) => {
    if ( typeof obj[key] === 'object' ) {
      constantize( obj[key] )
    }
  })
}