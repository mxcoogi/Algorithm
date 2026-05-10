
function moveZeroes(nums: number[]): void {
  let left: number = 0;
  let right: number = 1;
  let temp: number = 0;
  while (right <= nums.length - 1 && left <= nums.length - 1) {
    //현재 파악
    let leftNum = nums[left];
    let rightNum = nums[right];
    //스왑
    if (leftNum === 0 && rightNum !== 0) {
      temp = rightNum!;
      nums[right] = leftNum;
      nums[left] = temp;
    }
    while (left < nums.length && nums[left] !== 0) {
      left++;
    }
    //right 가 left 보다 크도록 보정 0이 아닌 정수 나올때까지 진행
    right = left + 1;
    while (right < nums.length && nums[right] === 0) {
      right++;
    }
  }
}