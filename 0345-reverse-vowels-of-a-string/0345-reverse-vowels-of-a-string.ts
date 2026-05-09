function reverseVowels(s: string): string {
  let result: string = "";
  let array: string[] = s.split("");
  let temp: string[] = [];
  const vowels = new Set<string>([
    "a",
    "e",
    "i",
    "o",
    "u",
    "A",
    "E",
    "I",
    "O",
    "U",
  ]);
  for (let i = 0; i < array.length; i++) {
    let isVowel: boolean = vowels.has(array[i]!);
    if (isVowel) {
      temp.push(array[i]!);
    }
  }
  for (let i = 0; i < array.length; i++) {
    let str: string = array[i]!;
    let isVowel: boolean = vowels.has(str);
    if (isVowel) {
      str = temp.pop()!;
    }
    result += str;
  }
  return result;
}
