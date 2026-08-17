package main

import (
	"fmt"
	"strconv"
)

func main() {
	var s1 string
	var a string
	fmt.Scan(&s1, &a)
	var result string
	loop, _ := strconv.Atoi(a)
	for i := 0; i < loop; i++ {
		result += s1
	}
	fmt.Println(result)
}
