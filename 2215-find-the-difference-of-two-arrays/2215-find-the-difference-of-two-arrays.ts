function findDifference(nums1: number[], nums2: number[]): number[][] {
  let result: number[][] = [[], []];
  let numOneSet: Set<number> = new Set(nums1);
  let numTwoSet: Set<number> = new Set(nums2);
  for (let i = 0; i < nums1.length; i++) {
    let a: number = nums1[i]!;
    if (!numTwoSet.has(a) && numOneSet.has(a)) {
      result[0]?.push(a);
      numOneSet.delete(a);
    }
  }
  for (let i = 0; i < nums2.length; i++) {
    let b: number = nums2[i]!;
    if (!numOneSet.has(b) && numTwoSet.has(b)) {
      result[1]?.push(b);
      numTwoSet.delete(b);
    }
  }

  return result;
}
