function maxVowels(s: string, k: number): number {
  let result: number = 0;

  let set: Set<string> = new Set<string>(["a", "e", "i", "o", "u"]);
  let left: number = 0;
  let right: number = 0;
  let cur: number = 0;
  while (right < k) {
    if (set.has(s.charAt(right++))) {
      cur++;
    }
  }
  result = cur;
  for (; right < s.length; right++) {
    if (set.has(s.charAt(left++))) {
      cur--;
    }
    if (set.has(s.charAt(right))) {
      cur++;
    }
    if (cur >= result) {
      result = cur;
    }
  }

  return result;
}
