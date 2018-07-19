// 遍历

let set = new Set(['red', 'green', 'blue'])

for (let item of set.keys()) {
  console.log(item)
}

// ...

for (let item of set.values()) {
  console.log(item)
}

// ...

for (let item of set.entries()) {
  console.log(item)
}

// ['red', 'red'] ...


// -----------------------

let set = new Set(['red', 'green', 'blue'])

for (let x of set) {
  console.log(x)
}

// ...s



set = new Set([1, 4, 9])
set.forEach((value, key) => console.log(key + ' : ' + value))

// 1 : 1
// ...

// -----------------
// 应用

let set = new Set(['red', 'green', 'blue'])
let arr = [...set]

let arr = [3, 4, 5, 5]
let unique = [...new Set(arr)]
// [3, 4, 5]

let set = new Set([1, 2, 3])
set = new Set([...set].map(x => x * 2))
// {2, 4, 6}

let set = new Set([1, 2, 3, 4, 5])
set = new Set([...set].filter(x => (x % 2) == 0))
// {2, 4}

// -----------------

let a = new Set([1, 2, 3])
let b = new Set([4, 3, 2])

// 并集
let union = new Set([...a, ...b])

// 交集
let intersect = new Set([...a].filter(x => b.has(x)))

// 差集
let difference = new Set([...a].filter(x => !b.has(x)))


// -----------------

let set = new Set([1, 2, 3])
set = new Set([...set].map(val => val * 2))

let set = new Set([1, 2, 3])
set = new Set(Array.from(set, val => val * 2))
