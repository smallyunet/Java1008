// 代理器 Proxy

var obj = new Proxy({}, {
  get: function (target, key, receiver) {
    console.log(`getting ${key}!`)
    return Reflect.get(target, key, receiver)
  },
  set: function (target, key, value, receiver) {
    console.log(`setting ${key}!`)
    return Reflect.set(target, key, value, receiver)
  }
})
obj.count = 1
++obj.count

// ----------------------
var proxy = new Proxy(target, handler)

// ----------------------
var proxy = new Proxy({}, {
  get: function(target, property) {
    return 35;
  }
})

proxy.time
proxy.name
proxy.title

// ----------------------
var target = {}
var handler = {}
var proxy = new Proxy(target, handler)
proxy.a = 'b'
target.a // b

// ----------------------
var object = { proxy: new Proxy(target, handler) }

// ----------------------
var proxy = new Proxy({}, {
  get: function(target, property) {
    return 35
  }
})

let obj = Object.create(proxy)
obj.name

// ----------------------
var handler = {
  get: function(target, name) {
    if (name === 'prototype') {
      return Object.prototype
    }
    return 'Hello, ' + name
  },

  apply: function(target, thisBilding, args) {
    return args[0]
  },

  construct: function(target, args) {
    return {value: args[1]}
  }
}

var fproxy = new Proxy(function(x, y) {
  return x + y
}, handler)

fproxy(1, 2)  // 1
new fproxy(1, 2)  // {value: 2}
fproxy.prototype === Object.prototype // true
fproxy.foo === "Hello, foo" // true

// ----------------------
// Proxy.revocable()
let target = {}
let handler = {}

let {proxy, revoke} = Proxy.revocable(target, handler)

proxy.foo = 123
proxy.foo // 123

revoke()
proxy.foo

// ----------------------
const target = {
  m: function() {
    console.log(this === proxy)
  }
}
const handler = {}

const proxy = new Proxy(target, handler)

target.m()  // false
proxy.m() // true

// ----------------------
const _name = new WeakMap()

class Person {
  constructor(name) {
    _name.set(this, name)
  }
  get name() {
    return _name.get(this)
  }
}

const jane = new Person('Jane')
jane.name   // 'jane

const proxy = new Proxy(jane, {})
proxy.name  // undefined

// ----------------------
const target = new Date()
const handler = {}
const proxy = new Proxy(target, handler)

proxy.getDate() // error

// ----------------------
const target = new Date('2015-01-01')
const handler = {
  get(target, prop) {
    if (prop == 'getDate') {
      return target.getDate.bind(target)
    }
    return Reflect.get(target, prop)
  }
}
const proxy = new Proxy(target, handler)

proxy.getDate() // 1

// ----------------------
const service = createWebService('http://example.com/data')

service.employees().then(json => {
  const employees = JSON.parse(json)
})

// ---

function createWebService(baseUrl) {
  return new Proxy({}, {
    get(target, propKey, receiver) {
      return () => httpGet(baseUrl + '/' + propKey)
    }
  })
}

