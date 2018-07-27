// 字典

function Dictionary() {
  this.datastore = new Array()
  this.add = add
  this.showAll = showAll
}

function add(key, value) {
  this.datastore[key] = value
}

function find(key) {
  return this.datastore[key]
}

function remove(key) {
  delete this.datastore[key]
}

function showAll() {
  for (var key of Object.keys(this.datastore)) {
    console.log(key + " -> " + this.datastore[key])
  }
}

/***************** 测试 ***************/
var pbook = new Dictionary()
pbook.add('Mike', 123)
pbook.add('sadf', 'ss')
pbook.showAll()