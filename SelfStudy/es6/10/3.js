// 属性名遍历

const obj = {}
let a = Symbol('a')
let b = Symbol('b')

obj[a] = 'Hello'
obj[b] = 'World'

const objectSymbols = Object.getOwnPropertySymbols(obj)
console.log(objectSymbols)


// ----------------------

const obj = {}

let foo = Symbol('foo')
Object.defineProperty(obj, foo, {
  value: 'foobar'
})

for (let i in obj) {
  console.log(i)  // 无输出
}

Object.getOwnPropertyNames(obj) // []
Object.getOwnPropertyNames(obj) // [Symbol(foo)]

// ----------------------
// new API

let obj = {
  [Symbol('my_key')]: 1,
  enum: 2,
  nonEnum: 3
}

Reflect.ownKeys(obj)

// ----------------------


let size = Symbol('size')

class Collection {
  constructor() {
    this[size] = 0
  }

  add(item) {
    this[this[size]] = item
    this[size]++
  }

  static sizeOf(instance) {
    return instance[size]
  }
}

let x = new Collection()
Collection.sizeOf(x) // 0

x.add('foo')
Collection.sizeOf(x) // 1

Object.keys(x) // ['0']
Object.getOwnPropertyNames(x) // ['0']
Object.getOwnPropertySymbols(x) // [Symbol(size)]


