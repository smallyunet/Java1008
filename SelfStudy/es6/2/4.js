// 不允许重复声明


function func() {
    let a = 10;
    var a = 1;
}

function func() {
    let a = 10;
    let a = 1;
}


function func(arg) {
    let arg;
}

function func(arg) {
    {
        let arg;
    }
}
