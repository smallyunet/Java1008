// 数组测试平台类
function CArray(numElements) {
  this.dataStore = []
  this.pos = 0
  this.numElements = numElements
  this.insert = insert
  this.toString = toString
  this.clear = clear
  this.setData = setData
  this.swap = swap
  this.bubbleSort = bubbleSort
  this.selectionSort = selectionSort
  this.selectionSort = selectionSort

  for (var i = 0; i < numElements; ++i) {
    this.dataStore[i] = i
  }
}

function setData() {
  for (var i = 0; i < this.numElements; ++i) {
    this.dataStore[i] = Math.floor(Math.random() * (this.numElements + 1))
  }
}

function clear() {
  for (var i = 0; i < this.dataStore.length; ++i) {
    this.dataStore[i] = 0
  }
}

function insert(element) {
  this.dataStore[this.pos++] = element
}

function toString() {
  var restr = ''
  for (var i = 0; i < this.dataStore.length; ++i) {
    restr += this.dataStore[i] + ' '
    if (i > 0 & i % 10 == 0) {
      restr += '\n'
    }
  }
  return restr
}

function swap(arr, index1, index2) {
  var temp = arr[index1]
  arr[index1] = arr[index2]
  arr[index2] = temp
}

// ---------------------------------

var numElements = 100
var myNums = new CArray(numElements)
myNums.setData()
// console.log(myNums.toString())

// ---------------------
// bubbleSort

function bubbleSort() {
  var numElements = this.dataStore.length
  var temp
  for (var outer = numElements; outer >= 2; --outer) {
    for (var inner = 0; inner <= outer - 1; ++inner) {
      if (this.dataStore[inner] > this.dataStore[inner + 1]) {
        swap(this.dataStore, inner, inner + 1)
      }
    }
    console.log(mynums.toString())
  }
}

// ---------------------
var numElements = 10
var mynums = new CArray(numElements)
mynums.setData()
console.log()
console.log(mynums.toString())
mynums.selectionSort()
console.log()
console.log(mynums.toString())

// ---------------------
// selectionSort()
function selectionSort() {
  var min, temp
  for (var outer = 0; outer <= this.dataStore.length-2 ; ++outer) {
    min = outer
    for (var inner = outer + 1; 
        inner <= this.dataStore.length - 1; 
        ++inner) {
          if (this.dataStore[inner] < this.dataStore[min]) {
            min = inner
          }
          swap(this.dataStore, outer, min)
    }
  }
}


// ---------------------
// insertionSort()
function insertionSort() {
  var temp, inner
  for (var outer = 1; outer <= this.dataStore.length - 1; ++outer) {
    temp = this.dataStore[outer]
    inner = outer
    while (inner > 0 && (this.dataStore[inner - 1] >= temp)) {
      this.dataStore[inner] = this.dataStore[inner - 1]
      --inner
    }
    this.dataStore[inner] = temp
  }
}

// ---------------------
// shellsort()
function shellsort() {
  for (var g = 0; g < this.gaps.length; ++g) {
    for (var i = this.gaps[g]; i < this.dataStore.length; ++i) {
      var temp = this.dataStore[i]
      for (var j = i; j >= this.gaps[g] && this.dataStore[j - this.gaps[g]] > temp;
        j -= this.gaps[g]) {
          this.dataStore[j] = this.dataStore[j - this.gaps[g]]
        }
        this.dataStore[j] = temp
    }
  }
}
