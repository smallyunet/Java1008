// 查找

// -----------------
function seqSearch(arr, data) {
  for (var i = 0; i < arr.length; ++i) {
    if (arr[i] == data) {
      return i
    }
  }
  return -1
}

function dispArr(arr) {
  for (var i = 0; i < arr.length; ++i) {
    putstr(arr[i] + ' ')
    if (i % 10 == 9) {
      putstr('\n')
    }
  }
  if (i % 10 != 0) {
    putstr('\n')
  }
}

var nums = []
for (var i = 0; i < 100; ++i) {
  nums[i] = Math.floor(Math.random() * 101)
}
dispArr(nums)
putstr('search: ')
var num = parseInt(readline())
print()
if (seqSearch(nums, num)) {
  print(num + ' yes')
} else {
  print(' none')
}
print()
dispArr(nums)

// min
function findMin(arr) {
  var min = arr[0]
  for (var i = 1; i < arr.length; ++i) {
    if(arr[i] < min) {
      min = arr[i]
    }
  }
  return min
}

// max
function findMax(arr) {
  var max = arr[0]
  for (var i = 1; i < arr.length; ++i) {
    if (arr[i] > max) {
      max = arr[i]
    }
  }
  return max
}

