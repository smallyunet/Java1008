package main

import "fmt"

func main() {
	var n int16 = 34
	var m int32
	//m = n
	m = int32(n)

	fmt.Printf("32 bit int is: %d\n", m)
	fmt.Printf("64 bit int is: %d\n", n)
}
