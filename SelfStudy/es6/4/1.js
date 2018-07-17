// 字符串遍历接口

for (let codePoint of 'foo') {
  console.log(codePoint)
}

// 判断

let s = 'Hello World'
s.startsWith('Hello') // true
s.endsWith('!') // true
s.includes('o') // true

s.startsWith('Hello', 6) // true
s.endsWith('!', 5) // true
s.includes('o', 6) // true


// 重复

'x'.repeat(3) // xxx
'hello'.repeat(2) // hellohello

'na'.repeat(2.9)  // nana

'na'.repeat(Infinity) // error
'na'.repeat(-1) // error

'na'.repeat(-0.9) // ''

'na'.repeat(NaN)  // ''

'na'.repeat('na') // ''
'na'.repeat('3')  // 'nanana


// es2017

'x'.padStart(5, 'ab') // ababx
'x'.padStart(4, 'ab') // abax

'x'.padEnd(5, 'ab') // xabab
'x'.padEnd(4, 'ab') // xaba

'xxx'.padStart(2, 'ab') // xxx
'xxx'.padEnd(2, 'ab') // xxx

'abc'.padStart(10, '0123456789')
