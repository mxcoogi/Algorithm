function closeStrings(word1: string, word2: string): boolean {
  if (word1.length !== word2.length) {
    return false;
  }
  let word1Map: Map<string, number> = new Map();
  let word2Map: Map<string, number> = new Map();
  for (let i = 0; i < word1.length; i++) {
    let char1: string = word1.charAt(i);
    let char2: string = word2.charAt(i);
    if (!word1Map.has(char1)) {
      word1Map.set(char1, 0);
    }
    if (!word2Map.has(char2)) {
      word2Map.set(char2, 0);
    }
    word1Map.set(char1, word1Map.get(char1)! + 1);
    word2Map.set(char2, word2Map.get(char2)! + 1);
  }
  for (const key of word1Map.keys()) {
    if (!word2Map.has(key)) {
      return false;
    }
  }
  let arr1: number[] = [...word1Map.values()].sort((a, b) => a - b);
  let arr2: number[] = [...word2Map.values()].sort((a, b) => a - b);
  for (let i = 0; i < arr1.length; i++) {
    if (arr1[i] !== arr2[i]) {
      return false;
    }
  }
  return true;
}
