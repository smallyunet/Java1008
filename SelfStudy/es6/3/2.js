// 默认值

let [foo = true] = []
foo // true

let [x, y = 'b'] = ['a']  // x=a, y=b
let [x, y = 'b'] = ['a', undefined] // x=a, y=b

// ----------------

let [x = 1] = [undefined]
x // 1
let [x = 1] = [null]
x // null


// ----------------
// 惰性求值
function f() {
  console.log('aaa')
}

let [x = f()] = [1]




let x;
if ([1][0] === undefined) {
  x = f()
} else {
  x = [1][0]
}


// ----------------

let [x = 1, y = x] = []
let [x = 1, y = x] = [2]
let [x = 1, y = x] = [1, 2]
let [x = y, y = 1] = [] // error

