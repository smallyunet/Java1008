function Queue() {
  this.dataStore = []
  this.enqueue = enqueue
  this.dequeue = dequeue
  this.front = front
  this.back = back
  this.toString = toString
  this.empty = empty
}

// 向队尾插入元素
function enqueue(element) {
  this.dataStore.push(element)
}

// 删除队首元素
function dequeue() {
  return this.dataStore.shift()
}

function front() {
  return this.dataStore[0]
}

function back() {
  return this.dataStore[this.dataStore.length - 1]
}

// 显示所有元素
function toString() {
  var retStr = ''
  for (var i = 0; i < this.dataStore.length; ++i) {
    retStr += this.dataStore[i] + '\n'
  }
  return retStr
}

// 判断队列是否为空
function empty() {
  if (this.dataStore.length == 0) {
    return true
  } else {
    return false
  }
}


/************** 测试 *************/
var q = new Queue()
q.enqueue('Meredith')
q.enqueue('Cynthia')
q.enqueue('Jennifer')
console.log(q.toString())
q.dequeue()
console.log(q.toString())

