// 暂时性死区

var tmp = 123;

if (true) {
    tmp = 'abc';    // error
    let tmp;
}



if (true) {
    // tdz start
    tmp = 'abc';
    console.log(tmp);

    let tmp;    // tdz end
    console.log(tmp); undefined

    tmp = 123;
    console.log(tmp);
}

// -----------------------------------

typeof x;
let x;


typeof undeclared_variable;

// -----------------------------------

function bar(x = y, y = 2) {
    return [x, y];
}
bar();



function bar(x = 2, y = x) {
    return [x, y];
}
bar();


// -----------------------------------


var x = x;
let x = x;
