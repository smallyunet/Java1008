// 数值和布尔值解构

let {toString: s} = 123
s === Number.prototype.toString // true

let {toString: s} = true
s === Boolean.prototype.toString // true



// error
let { prop: x } = undefined
let { prop: y } = null 