import (
	"strconv"
)

func solution(a int, b int) int {
	x, _ := strconv.Atoi(strconv.Itoa(a) + strconv.Itoa(b))
	y := a * b * 2
	if x >= y{
		return x
	}else{
		return y
	}
}
