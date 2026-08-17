package main

import (
	"fmt"
)

func main() {
	var s1 string
	fmt.Scan(&s1)
	var result string
	for i := 0; i < len(s1); i++ {
		result += chg(s1[i])
	}
	fmt.Println(result)

}
func chg(char byte) string {

	if char >= 'A' && char <= 'Z' {
		return string(char + 32)
	} else {
		return string(char - 32)
	}

}
