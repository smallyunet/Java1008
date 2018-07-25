// class

// es5
function Point(x, y) {
  this.x = x
  this.y = y
}

Point.prototype.toString = function() {
  return '(' + this.x + ', ' + this.y + ')'
}

var p = new Point(1, 2)

// es6
class Point {
  constructor(x, y) {
    this.x = x
    this.y = y
  }

  toString() {
    return '(' + this.x + ', ' + this.y + ')'
  }
}


// ----------
class Bar {
  doStuff() {
    console.log('stuff')
  }
}

var b = new Bar()
b.doStuff()

// ----------
const MyClass = class Me {
  getClassName() {
    return Me.name
  }
}

// ----------
class Foo {
  static classMethod() {
    return 'hello'
  }
}

Foo.classMethod() // 'hello'

