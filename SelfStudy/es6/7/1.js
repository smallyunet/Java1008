// function

function log(x, y) {
  y = y || 'World'
  console.log(x, y)
}

log('Hello')
log('Hello', 'China')
log('Hello', '')

// -----------------------------

if(typeof y === 'undefined') {
  y = 'World'
}

// -----------------------------

function log(x, y = 'World') {
  console.log(x, y)
}

function Point(x = 0, y = 0) {
  this.x = x
  this.y = y
}
const p = new Point()
p // {x:0, y:0}


function foo(x = 5) {
  let x = 1   // error
  const x = 2 //error
}

// -----------------------------
// ok
function foo(x, x, y) {
  // ...
}

// error
function foo(x, x, y = 1) {

}

// -----------------------------

let x = 99
function foo(p = x + 1){
  console.log(p)
}

foo() //100

x = 100
foo() // 101

// -----------------------------

function foo({x, y = 5}) {
  console.log(x, y)
}

foo({}) // undefined 5
foo({x: 1}) // 1 5
foo({x: 1, y: 2}) // 1 2
foo() // error


function foo({x, y = 5} = {}) {
  console.log(x, y)
}

foo() // undefined 5

// -----------------------------

function fetch(url, { body = '', method = 'GET', headers = {} }){
  console.log(method)
}

fetch('http://example.com', {})
// get

fetch('http://example.com')
// error


