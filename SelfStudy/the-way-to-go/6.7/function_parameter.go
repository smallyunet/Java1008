package main

import "fmt"

func main() {
	fmt.Printf("The sum of %d and %d is: %d\n", a, b, a + b)
}

func Add(a, b, int) {
	fmt.Printf("The sum of %d and %d is: %d\n", a, b, a + b)
}
func callback(y int, f func(int, int)) {
	f(y, 2)
}
