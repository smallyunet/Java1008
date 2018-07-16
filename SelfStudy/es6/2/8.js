// 顶层对象的属性

// es5
window.a = 1
a // 1

a = 2
window.a  // 2


// es6
var a = 1
window.a   // 1

let b = 1
window.b  // undefined