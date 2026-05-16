function longestSubarray(nums: number[]): number {
  let left: number = 0;
  let right: number = 0;
  let max: number = 0;
  let zero: number = 0;
  for (right; right < nums.length; right++) {
    if (nums[right] === 0) {
      zero++;
    }
    while (zero > 1) {
      if (nums[left] === 0) {
        zero--;
      }
      left++;
    }
    max = Math.max(max, right - left);
  }
  return max;
}
