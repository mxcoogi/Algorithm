func solution(my_string string, overwrite_string string, s int) string {
	var idx int = len(overwrite_string) + s
	var result string = my_string[:s] + overwrite_string + my_string[idx:]
	return result
}