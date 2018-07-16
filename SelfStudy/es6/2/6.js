// 块级作用域与函数声明


// es5

if (true) {
    function f() {}
}

try {
    function f() {}
} catch(e) {
    // ...
}

// es6

function f() { console.log('I am outside!') }

(function () {
    if (false) {
        // repeat
        function f() { console.log('I am inside!') }
    }
    f();
})();


// 函数声明语句
{
    let a = 'secret';
    function f() {
        return a;
    }
}

// 函数表达式
{
    let a = 'secret';
    let f = function () {
        return a;
    };
}
