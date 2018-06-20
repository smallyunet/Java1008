function log(target) {
	const desc = Object.getOwnPropertyDescriptor(target.prototype);

	for (const key of Object.keys(desc)) {
		if (key === "constructor") {
			continue;
		}
		
		const func = desc[key].value;
		
		if ('fundtion' === typeof func) {
			Object.defineProperty(target.propertype, key, {
				value(...args) {
					console.log('before' + key);	
					const ret = func.apply(this, args);
					console.log('after' + key);
					
					return ret;
				}
			})
		}
	}
}


@log
class Numberic {
	PI = 3.1415926;
	
	add(...nums) {
		return nums.reduce((p, n) => (p + n), 0)
	}
}

new Numberic().add(1, 2);

// class Animal {
// 	name() {
// 		return 'Animal';
// 	}
// 	say() {
// 		return `I'm ${this.name()}`;
// 	}
// }
// 
// class Dog extends Animal {
// 	food = 'bone';
// 	name() {
// 		return 'Dog';
// 	}
// }
// 
// console.log(new Dog() instanceof Animal);

// function Animal() {}
// function Dog() {}
// 
// Object.defineProperties(Animal.prototype, {
// 	name: {
// 		value() {
// 			return 'Animal';
// 		}
// 	},
// 	say: {
// 		value() {
// 			return `I'm ${this.name()}`;
// 		}
// 	}
// });
// 
// // dog instanceof Animal => true
// //
// // dog.__proto__.proto__... === Animal.prototype
// //
// //
// // dog.__proto__ === Dog.prototype
// //
// // Dog.prototype.__proto__ === Animal.prototype
// //
// // 
// Dog.prototype = Object.create(Animal.prototype, {
// 	constructor: {
// 		value: Dog,
// 		enumerable: false
// 	},
// 	name: {
// 		value() {
// 			return 'Dog';
// 		}
// 	}
// });
// 
// console.log(Dog.prototype.constructor);