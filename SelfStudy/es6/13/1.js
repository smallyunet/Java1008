// Reflect

// old
try {
  Object.defineProperty(EventTarget, property, attributes)
} catch (e) {
  // failure
}

// new
if (Reflect.defineProperty(EventTarget, property, attributes)) {
  // success
} else {
  // failure
}

// --------------------------

// old
'assign' in Object  // true

// new 
Reflect.has(Object, 'assign') // true

// --------------------------

Proxy(EventTarget, {
  set: function(target, name, value, receiver) {
    var success = Reflect.set(target, name, value, receiver)
    if (success) {
      log('property ' + name + ' on ' + target + ' set to ' + value)
    }
    return success
  }
})

// --------------------------

var loggedObj = new Proxy(obj, {
  get(target, name) {
    console.log('get', target, name)
    return Reflect.get(target, name)
  },
  deleteProperty(target, name) {
    console.log('delete' + name)
    return Reflect.deleteProperty(target, name)
  },
  has(target, name) {
    console.log('has' + name)
    return Reflect.has(target, name)
  }
})

// --------------------------

// old
Function.prototype.apply.call(Math.floor, undefined, [1.75])

// new 
Reflect.apply(Math.floor, undefined, [1.75])

