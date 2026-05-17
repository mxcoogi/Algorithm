function pivotIndex(nums: number[]): number {
  let left: number = 0;
  let total: number = nums.reduce((acc, cur) => acc + cur, 0);
  for (let i = 0; i < nums.length; i++) {
    let right = total - left - nums[i]!;
    if (left === right) {
      return i;
    }
    left += nums[i]!;
  }
  return -1;
}
