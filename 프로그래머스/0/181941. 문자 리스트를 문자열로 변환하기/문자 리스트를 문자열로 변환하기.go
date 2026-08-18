func solution(arr []string) string {
	var result string;
	for i := 0; i < len(arr); i++ {
		result += arr[i]
	}
	return result;
}