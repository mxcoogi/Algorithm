function isSubsequence(s: string, t: string): boolean {
  let sIdx: number = 0;
  let tIdx: number = 0;
  while (tIdx < t.length) {
    if (t.charAt(tIdx) === s.charAt(sIdx)) {
      sIdx++;
    }
    tIdx++;
  }
  return sIdx === s.length;
}
