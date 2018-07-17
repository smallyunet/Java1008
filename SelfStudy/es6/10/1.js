// Symbol

let s = Symbol()
console.log(typeof s)


let s1 = Symbol('foo')
let s2 = Symbol('bar')

s1  // Symbol(foo)
s2

s1.toString // 'Symbol(foo)'

// -------------------

const obj = {
  toString() {
    return 'abc'
  }
}
const sym = Symbol(obj)
sym // Symbol(abc)


// -------------------

let s1 = Symbol()
let s2 = Symbol()

s1 === s2 // false


let s1 = Symbol('foo')
let s2 = Symbol('foo')

s1 === s2 // false


// -------------------

let sym = Symbol('My symbol')

'your symbol is ' + sym // error
`your symbol is ${sym}`


// -------------------

let sym = Symbol()
Boolean(sym)  // true
!sym  // false


if(sym) {
  // ...
}

Number(sym) // error
sym + 2   // error

