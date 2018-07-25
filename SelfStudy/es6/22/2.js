// import

import {firstName, lastName, year} from './profile.js'

function setName(element) {
  element.textContent = firstName + ' ' + lastName
}

// -----

import { lastName as surname } from './profile.js'


import { a } from './xxx.js'

a = {}  // error

// --------

import {a} from './xxx.js'

a.foo = 'hello'

// --------

import {myMethod} from 'util'

// --------

foo()

import { foo } from 'my_module' // error

// --------
// error
import { 'f' + 'oo' } from 'my_module'
// error
let module = 'my_module'
import { foo } from module
// error
if (x === 1) {
  import { foo } from 'module1'
} else {
  import { foo } from 'module2'
}


// --------
import { foo } from 'my_module'
import { far } from 'my_module'

// ==
import { foo, bar } from 'my_module'


