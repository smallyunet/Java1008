// for

let s1 = Symbol.for('foo')
let s2 = Symbol.for('foo')

s1 === s2 // true

Symbol.for('bar') === Symbol.for('bar') // true
Symbol(bar) === Symbol('bar') // false

// keyFoe

let s1 = Symbol.for('foo')
Symbol.keyFor(s1) // 'foo'

let s2 = Symbol('foo')
Symbol.keyFor(s2) // undefined


// ------------------------

iframe = document.createElement('iframe')
iframe.src = String(window.location)
document.body.appendChild(iframe)

iframe.contentWindow.Symbol.for('foo') === Symbol.for('foo')  // true


// singleton pattern

// mod.js
function A(){
  this.foo = 'hello'
}

if(!global._foo) {
  global._foo = new A()
}

module.exports = global._foo

// 加载
const a = require('./mod.js')
console.log(a.foo)

// 但是global._foo可写
global._foo = { foo: 'world' }

const a = require('./mod.js')
console.log(a.foo)


// use symbol

// mod.js
const FOO_KEY = Symbol.for('foo')

function A() {
  this.foo = 'hello'
}

if (!global[FOO_KEY]) {
  global[FOO_KEY] = new A()
}

modules.exports = global[FOO_KEY]

// use

global[Symbol.for('foo')] = { foo: 'world' }
const a = require('./mod.js')

// 无法改写
const FOO_KEY = Symbol('foo')

