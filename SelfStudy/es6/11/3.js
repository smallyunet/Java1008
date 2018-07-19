// WeakSet

const ws = new WeakSet()
ws.add(1) // error
ws.add(Symbol())  // error


// -----------------------

const a = [[1, 2], [3, 4]]
const ws = new WeakSet(a)
// WeakSet {[1, 2], [3, 4]

const b = [3, 4]
const ws = new WeakSet(b) 
// error


// -----------------------

const ws = new WeakSet()
const obj = {}
const foo = {}

ws.add(window)
ws.add(obj)

ws.has(window) // true
ws.has(foo) // true

ws.delete(window)
ws.has(window)  // false


ws.size // undefined
ws.forEach  // undefined

ws.forEach(function (item) { console.log('WeakSet has ' + item) })  // error

// -----------------------

const foos = new WeakSet()
class Foo {
  constructor() {
    foos.add(this)
  }
  method () {
    if (!foos.has(this)) {
      throw new TypeError('Foo.prototype.method 只能在Foo的实例上调用')
    }
  }
}

