function maxArea(height: number[]): number {
  let left: number = 0;
  let right: number = height.length - 1;
  let max: number = 0;
  while (left < right) {
    let w: number = right - left;
    let rh: number = height[right]!;
    let lh: number = height[left]!;
    if (rh > lh) {
      max = w * lh > max ? w * lh : max;
      left++;
    } else {
      max = w * rh > max ? w * rh : max;
      right--;
    }
  }

  return max;
}
