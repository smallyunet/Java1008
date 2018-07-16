// global 对象

// method 1 
(typeof window !== 'undefined'
  ? window
  : (typeof process === 'object' &&
    typeof require == 'function' &&
    typeof global === 'object')
  ? global
  : this)

// method 2
var getGlobal = function () {
  if (typeof self !== 'undefined') { return self }
  if (typeof window !== 'undefined') { return window }
  if (typeof global !== 'undefined') { return global }
  throw new Error('unable to locate global object')
}