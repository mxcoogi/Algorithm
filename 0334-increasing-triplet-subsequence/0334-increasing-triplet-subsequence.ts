function increasingTriplet(nums: number[]): boolean {
  let first: number = Infinity;
  let second: number = Infinity;

  for (const num of nums) {
    if (first >= num) {
      first = num;
    } else if (second >= num) {
      second = num;
    } else {
      return true;
    }
  }

  return false;
}