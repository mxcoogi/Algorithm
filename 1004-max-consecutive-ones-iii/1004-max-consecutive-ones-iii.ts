function longestOnes(nums: number[], k: number): number {
  let left: number = 0;
  let right: number = 0;
  let zero: number = 0;
  let one: number = 0;
  let max: number = 0;

  while (left <= right && right < nums.length) {
    if (nums[right++] == 0) {
      zero++;
    } else {
      one++;
    }
    if (zero > k) {
      while (zero > k) {
        if (nums[left++] == 0) {
          zero--;
        } else {
          one--;
        }
      }
    }
    if (max <= zero + one) {
      max = zero + one;
    }
  }
  return max;
}
