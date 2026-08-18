func solution(n int) int {
	var res int
	if n%2 == 0 {
		for n > 0 {
			res += n * n
			n -= 2
		}
	} else {
		for n > 0 {
			res += n
			n -= 2
		}
	}
	return res
}