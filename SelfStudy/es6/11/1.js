// Set

const s = new Set()

;[2, 3, 4, 5, 4, 2, 2].forEach(x=>s.add(x))

for (let i of s) {
  console.log(i)
}

// 2 3 4 5


// --------------------


const set = new Set([1, 2, 3, 4, 5, 6])
;[...set]

const item = new Set([2, 3, 4, 5, 6])
items.size  

const set = new Set(document.querySelectorAll('div'))
set.size

const set = new Set()
document
  .querySelectorAll('div')
  .forEach(div => set.add(div))
set.size


// 去除重复元素
;[...new Set(array)]


// --------------------

let set = new Set()
let a = NaN
let b = NaN
set.add(a)
set.add(b)
set // Set {NaN}

// --------------------

let set = new Set()

set.add({})
set.size

set.add({})
set.size

// --------------------

s.add(2).add(2)

s.size

s.has(1)  // true
s.has(2)  // true
s.has(3)  // false

s.delete(2)
s.has(2)  // false


// --------------------

const properties = {
  'width': 1,
  'height': 1
}

if (properties[someName]) {
  // do something
}

// set

const properties = new Set()

properties.add('width')
properties.add('height')

if (properties.has(someName)) {
  // do something
}

// --------------------

const items = new Set([1, 2, 3, 4, 5])
const array = Array.from(items)

// --------------------
// 去重

function dedupe(array) {
  return Array.from(new Set(array))
}

dedupe([1, 1, 2, 3])
