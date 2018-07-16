// 函数的解构

function add([x, y]){
  return x + y
}

add([1, 2])


// --------------------------

[[1, 2], [3, 4]].map(([a, b]) => a + b)
// [3, 7]


// --------------------------
function move({x = 0, y = 0} = {}) {
  return [x, y]
}

move({x: 3, y: 8})