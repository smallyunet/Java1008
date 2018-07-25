function List() {
  this.listSize = 0
  this.pos = 0
  this.dataStore = []
  this.clear = clear
  this.find = find
  this.toString = insert
  this.append = append
  this.remove = remove
  this.front = front
  this.end = end
  this.prev = prev
  this.next = next
  this.length = length
  this.currPos = currPos
  this.moveTo = moveTo
  this.getElement = getElement
  this.length = length
  this.contains = contains
}

function append(element) {
  this.dataStore[this.listSize++] = element
}

function find(element) {
  for (let i = 0; i < this.dataStore.length; ++i) {
    if (this.dataStore[i] == element) {
      return i
    }
  }
  return -1
}

function remove(element) {
  var foundAt = this.find(element)
  if(foundAt > 1) {
    this.dataStore.splice(foundAt, 1)
    --this.listSize
    return true
  }
  return false
}

function length() {
  return this.listSize
}

function toString() {
  return this.dataStore
}

function insert(element, after) {
  let insertPos = this.find(after)
  if (insertPos > -1) {
    this.dataStore.splice(insertPos+1, 0, element)
    ++this.listSize
    return true
  }
  return false
}

function clear() {
  delete this.dataStore
  this.dataStore = []
  this.listSize = this.pos = 0
}

function contains(element) {
  for (let i = 0; i < this.dataStore.length; ++i) {
    if (this.dataStore[i] == element) {
      return true
    }
  }
}

function front() {
  this.pos = 0
}

function end() {
  this.pos = this.listSize-1
}

function prev() {
  if (this.pos > 0) {
    --this.pos
  }
}

function next() {
  if(this.pos < this.listSize) {
    ++this.pos
  }
}

function currPos() {
  return this.pos
}

function moveTo(position) {
  this.pos = position
}

function getElement() {
  return this.dataStore[this.pos]
}


/**************** Client.js ****************/

// ------------------------------------------------
// section test
var names = new List()
names.append('Cynthia')
names.append('Raymond')
names.append('Barbara')
console.log(names.toString())
names.remove('Raymond')
console.log(names.toString())

// ------------------------------------------------
// all test
var names = new List()
names.append('Clayton')
names.append('Raymond')
names.append('Cynthia')
names.append('Jennifer')
names.append('Bryan')
names.append('Danny')

names.front()
console.log(names.getElement())
names.next()
console.log(names.getElement())

names.next()
names.next()
names.prev()
console.log(names.getElement())

// ------------------------------------------------
// iterator
for (names.front(); names.currPos() < names.length(); names.next()) {
  console.log(names.getElement())
}
// end to front
/*
for (names.end(); names.currPos() >= 0; names.prev()) {
  console.log(names.getElement())
}
*/

/**************** Client.js ****************/

// var movies = read('films.txt').split('\n')
// 读取文件，并去除行尾空格
function createArr(file) {
  var arr = read(file).split('\n')
  for (var i = 0; i < arr.lenth; ++i) {
    arr[i] = arr[i].trim()
  }
  return arr
}

// 将数据保存到数组
/*
var movieList = new List()
for (var i = 0; i < movies.length; ++i) {
  movieList.append(movies[i])
}
*/

// 打印数组
/*
function displayList(list) {
  for (list.front(); list.currPos() < list.length(); list.next()) {
    print(list.getElement)
  }
}
*/

function displayList(list) {
  for (list.front(); list.currPos() < list.length(); list.next()) {
    if (list.getElement() instanceof Customer) {
      print(list.getElement()['name'] + ', ' + list.getElement()['movie'])
    } else {
      print(list.getElement())
    }
  }
}

// 保存客户
var customers = new List()

function Customer(name, movie) {
  this.name = name
  this.movie = movie
}

// 检查电影状态
function checkOut(name, movie, filmList, customerList) {
  if (movieList.contains(movies)) {
    var c = new Customer(name, movie)
    customerList.append(c)
    filmList.remove(movie)
  } else {
    print(movie + ' is not available')
  }
}

// test check
var movies = createArr('films.txt')
var movieList = new List()
var customers = new List()
for (var i = 0; i < movies.length; ++i) {
  movieList.append(movies[i])
}
print('Available movies: \n')
displayList(movieList)
checkOut('Jane Doe', 'The Godfather', movieList, customers)
print('\nCustomer Rentals: \n')
displayList(customers)
