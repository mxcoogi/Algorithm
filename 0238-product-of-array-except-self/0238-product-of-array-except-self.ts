function productExceptSelf(nums: number[]): number[] {
  let result: number[] = [];
  let left: number[] = [1];
  let right: number[] = [1];
  //왼쪽 곱 구하기
  for (let i = 1; i < nums.length; i++) {
    let num = left[i - 1]! * nums[i - 1]!;
    left.push(num);
  }
  //오른쪽 곱 구하기
  for (let i = 1; i < nums.length; i++) {
    let num = right[i - 1]! * nums[nums.length - i]!;
    right.push(num);
  }
  for (let i = 0; i < nums.length; i++) {
    let num = left[i]! * right[nums.length - i - 1]!;
    result.push(num);
  }
  return result;
}
