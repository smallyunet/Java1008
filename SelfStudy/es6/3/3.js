// 对象的解构赋值

let { foo, bar } = { foo: "aaa", bar: "bbb" }
foo // aaa
bar // bbb

let { baz } = { foo: "aaa", bar: "bbb" }
baz



let obj = { first: 'hello', last: 'world' }
let { first: f, last: l } = obj
f // 'hello'
l // 'world'


// -------------------

let { foo: baz } = { foo: "aaa", bar: "bbb" }
baz // "aaa"
foo // error


// -------------------
// 嵌套
let obj = {
  P: [
    'Hello',
    { y: 'World' }
  ]
}

let { P: [x, { y }] } = obj
x
y


let obj = {
  P: [
    'Hello',
    { y: 'World' }
  ]
}

let { p, p: [x, { y }] } = obj
x
y


// -------------------

const node = {
  loc: {
    start: {
      line: 1,
      column: 5
    }
  }
}

let { loc, loc: { start }, loc: { start: { line } } } = node
line  // 1
loc // object
start // object


// -------------------
// 嵌套赋值
let obj = {}
let ar = []

  ({ foo: obj.prop, bar: arr[0] } = {})

obj
arr

// -------------------
// 默认值

var { x = 3 } = {}

var { x, y = 5 } = { x: 1 }
x // 1
y // 5

var { x: y = 3 } = {}
y // 3

var { x: y = 3 } = { x: 5 }
y // 5

var { message: msg = 'songthing went wrong' } = {}
msg


// -------------------

var { x = 3 } = { x: undefined }
x // 3

var { x = 3 } = { x: null }
x // null


// -------------------

let { foo } = { bar: 'baz' }
foo // undefined

let { foo: { bar } } = { baz: 'baz' } // error


// -------------------

let x;
{ x } = { x: 1 }  // error


let x;
({ x } = { x: 1 })  // ok


  // -------------------

  ({} = [true, false])
  ({} = 'abc')
  ({} = [])


// -------------------

let { log, sin, cos } = Math

// -------------------

let arr = [1, 2, 3]
let { 0: first, [arr.length - 1]: last } = arr
first  // 1
last // 3