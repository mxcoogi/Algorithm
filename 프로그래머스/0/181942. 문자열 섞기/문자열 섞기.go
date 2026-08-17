func solution(str1 string, str2 string) string {
	var _len int = len(str1)
	var res string
	for i := 0; i < _len; i++ {
		res += string(str1[i]) + string(str2[i])
	}
	return res
}