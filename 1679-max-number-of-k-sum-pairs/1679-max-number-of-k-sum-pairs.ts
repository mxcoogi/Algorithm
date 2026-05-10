function maxOperations(nums: number[], k: number): number {
  let left: number = 0;
  let right: number = nums.length - 1;
  let result: number = 0;
  nums = nums.sort((a, b) => a - b);
  while (left < right) {
    let sum: number = nums[left]! + nums[right]!;
    if (sum === k) {
      result++;
      left++;
      right--;
    } else if (sum > k) {
      right--;
    } else {
      left++;
    }
  }
  return result;
}
