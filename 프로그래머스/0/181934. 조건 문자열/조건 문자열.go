func solution(ineq string, eq string, n int, m int) int {
	if(sub(ineq, eq, n, m)){
		return 1
	}
	return 0
}

func sub(ineq string, eq string, n int, m int) bool{
	switch ineq {
	case ">":
		if eq == "!" {

			return n > m
		} else {
			return n >= m
		}
	case "<":
		if eq == "!" {
			return n < m
		} else {
			return n <= m
		}
	default:
		return true
	}
}