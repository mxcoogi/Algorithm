package main

import "fmt"

func main() {
	var s1 string
	fmt.Scan(&s1)
	for _, i2 := range s1 {
		fmt.Println(string(i2))
	}
}
