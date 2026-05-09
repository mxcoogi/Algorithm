function reverseWords(s: string): string {
  let result: string = "";
    s = s.trim();
    let words: string[] = s.split(/\s+/);

    while(words.length !== 0){
        result += words.pop() + " ";
    }
    
  return result.trim();
}
