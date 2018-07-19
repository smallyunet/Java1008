// size
const map = new Map()
map.set('foo', true)
map.set('bar', false)
map.size  // 2

// set
const m = new Map()
m.set('edition', 6)
m.set(262, 'standard')
m.set(undefined, 'nah')

let map = new Map()
  .set(1, 'a')
  .set(2, 'b')
  .set(3, 'c')

// get
const m = new Map()

const hello = function() { console.log('hello') }
m.set(hello, 'Hello ES6!')
m.get(hello)

// has
const m = new Map()

m.set('edition', 6)
m.set(262, 'standard')
m.set(undefined, 'nan')

m.has('edition')
m.has('year') // false
m.has(262)
m.has(undefined)

// delete
const m = new Map()
m.set(undefined)
m.has(undefined)

m.delete(undefined)
m.has(undefined)

// clear
let map = new Map()
map.set('foo', true)
map.set('bar', false)

map.size// 2
map.clear()
map.size// 0



// 遍历

const map = new Map([
  ['F', 'no'],
  ['T', 'yes']
])

for (let key of map.keys()) {
  console.log(key)
}
// 'f'   't'

for (let value of map.values()) {
  console.log(value)
}
// 'no'   'yes' 

for (let item of map.entries()) {
  console.log(item[0], item[1])
}
// 'f'  'no'
// 't'  'yes'

for (let [key, value] of map.entries()) {
  console.log(key, value)
}
// 'f'  'no'
// 't'  'yes'


// ----------------------------------

const map0 = new Map()
  .set(1, 'a')
  .set(2, 'b')
  .set(3, 'c')

const map1 = new Map(
  [...map0].filter(([k1, v]) => k < 3)
)

