function findMaxAverage(nums: number[], k: number): number {
  let left: number = 0;
  let right: number = 0;
  let sum: number = 0;

  for (; right < k; right++) {
    sum += nums[right]!;
  }
  let max: number = sum;

  while (right < nums.length) {
    sum -= nums[left++]!;
    sum += nums[right++]!;
    if (max <= sum) {
      max = sum;
    }
  }
  return max / k;
}
