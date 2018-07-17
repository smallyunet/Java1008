// 作为属性名

let mySymbol = Symbol()

let a = {}
a[mySymbol] = 'Hello!'

let a = {
  [mySymbol]: 'Hello'
}

let a = {}
Object.defineProperty(a, mySymbol, { value: 'Hello!' })


a[mySymbol] // 'Hello'

// --------------------

const mySymbol = Symbol()
const a = {}

a.mySymbol = 'Hello!'
a[mySymbol] // undefined
a['mySymbol'] // 'Hello!'


// --------------------

let s = Symbol()

let obj = {
  [s]: function (arg) { ... }
}

obj[s](123)




let obj = {
  [s](arg) { ... }
}

// --------------------
// 定义一组常量

const log = {}

log.levels = {
  DEBUG: Symbol('debug'),
  INFO: Symbol('info'),
  WARN: Symbol('warn')
}
console.log(log.levels.DEBUG, 'debug message')
console.log(log.levels.INFO, 'info message')




const COLOR_RED = Symbol()
const COLOR_GREEN = Symbol()

function getComplement(color) {
  switch(color) {
    case COLOR_RED:
      return COLOR_GREEN;
    case COLOR_GREEN:
      return COLOR_RED;
    default: 
      throw new Error('Undefined color')
  }
}

// --------------------
// 魔术字符串

function getArea(shape, options) {
  let area = 0;

  switch (shape) {
    case 'Triangle':
      area = .5 * options.width * options.height
      break
  }
  return area
}
getArea('Triangle', { width: 100, height: 100 })

// --------------------

// const shapType = {
//   triangle: 'Triangle'
// }

const shapType = {
  triangle: Symbol()
}

function getArea(shape, options) {
  let area = 0;

  switch (shape) {
    case shapType.triangle:
      area = .5 * options.width * options.height
      break
  }
  return area
}
getArea(shapType.triangle, { width: 100, height: 100 })
