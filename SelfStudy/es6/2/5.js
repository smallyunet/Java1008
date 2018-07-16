// 块级作用域

// 为什么需要

var tmp = new Date();

function f() {
    console.log(tmp);
    if(false) {
        var tmp = 'hello world';
    }
}

f();


// -------------


var s = 'hello';

for (var i = 0; i < s.length; i++) {
    console.log(s[i]);
}

console.log(i);


// es6的块级作用域

function f1() {
    let n =5;
    if(true) {
        let n = 10;
    }
    console.log(n);
}
f1();


{{{{{ let insane = 'Hello World' }}}}}

{{{{
    {let insane = 'Hello World'}
    console.log(insane);
}}}}


{{{{
    {let insane = 'Hello World'}
    let insane = 'Hello World';
}}}}


// IIFE
(function {
    var tmp = 123;
})();

// 块级作用域写法
{
    let tmp = 123;
}
