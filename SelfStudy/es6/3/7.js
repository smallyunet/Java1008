// 用途

// 交换变量的值
let x = 1
let y = 2
[x, y] = [y, x]



// 从函数返回多个值
function example() {
  return [1, 2, 3]
} 
let [a, b, c] = example()

// 返回一个对象

function example() {
  return {
    foo: 1,
    bar: 2
  }
}

let { foo, bar } = example()


// 函数参数的定义
// 提取JSON数据
// 函数参数默认值


// 遍历MAP
const map = new Map()
map.set('first', 'hello')
map.set('second', 'world')

for (let [key, value] of map) {
  console.log(key + ' is ' + value)
}




// 输入模块的指定方法
const { SourceMapConsumer, SourceNode} = require("source-map")