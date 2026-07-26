func maximumProduct(nums []int) int {
	
	slices.Sort(nums);
	var num1 int = nums[len(nums)-1] * nums[0] * nums[1];
	var num2 int = nums[len(nums)-1] * nums[len(nums)-2] * nums[len(nums)-3];

	return max(num1, num2);
}
func max(num1 int, num2 int) int{
	if(num1 > num2){
		return num1;
	}
	return num2;
}