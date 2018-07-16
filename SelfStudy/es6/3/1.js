// 数组的结构赋值

// 基本用法

let a = 1
let b = 2
let c = 3

// es6

let [a, b, c] = [1, 2, 3]

// ------------------------

let [foo, [[bar], baz]] = [1, [[2], 3]]
foo // 1
bar // 2
baz // 3

let [ , , third] = ["foo", "bar", "baz"]
third

let [x, , y] = [1, 2, 3]
x // 1
y // 3

let [head, ...tail] = [1, 2, 3, 4]
head  // 1
tail  // 2, 3, 4

let [x, y, ...z] = ['a']
x // a
y // undefined
z // []

// ------------------------

let [foo] = []
let [bar, foo] = [1]
// 解构不成功为undefined

// ------------------------

let [x, y] = [1, 2, 3]
x // 1
y // 2

let [a, [b], d] = [1, [2, 3], 4]
a // 1
b // 2
c // 4

// ------------------------
// 解构失败
let [foo] = 1
let [foo] = false
let [foo] = NaN
let [foo] = undefined
let [foo] = null
let [foo] = {}

// ------------------------
// Set结构
let [x, y, z] = new Set(['a', 'b', 'c'])
x // 'a'


// ------------------------
// 具有Iterator都可以

function* fibs() {
  let a = 0
  let b = 1
  while(true) {
    yield a
    [a, b] = [b, a + b]
  }
}

let [first, second, third, forth, fifth, sixth] = fibs();
sixth // 5
