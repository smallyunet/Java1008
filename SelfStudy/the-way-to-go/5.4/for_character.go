package main

func main() {
	// 1
	for i := 1; i <= 25; i++ {
		for j := 1; j <= i; i++ {
			print("G")
		}
		println()
	}
	// 2
	str := "G"
	for i := 1; i <= 25; i++ {
		print(str)
		str += "G"
	}
}
