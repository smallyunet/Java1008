// module

// CommonJS
let { stat, exists, readFile } = require('fs')

// ==
let _fs = require('fs')
let stat = _fs.stat
let exists = _fs.exists
let readfile = _fs.readfile


// es6
import { stat, exists, readFile } from 'fs'


// ---
export function multiply(x, y) {
  return x * y
}

// ---
function v1() { ... }
function v2() { ... }

export {
  v1 as streamV1,
  v2 as streamV2,
  v2 as streamLatestVersion
}


// ---
// errot
export 1
// error
var m = 1
export m

// ---
export vaer m = 1

var m = 1
export {m}

var n = 1
export {n as m}


// -------
function f() {}
export f;   // error

export function f() {}

function f() {}
export {f}


// -------
export var foo = 'bar'
setTimeout(() => foo = 'baz', 500)

// -------
function foo() {
  export default 'bar'  // error
}
foo()

