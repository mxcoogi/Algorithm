func solution(num int, n int, m int) int {
	if num%n == 0 && num%m == 0{
		return 1
	}
	return 0
}