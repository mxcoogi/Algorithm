function compress(chars: string[]): number {
  let write: number = 0;
  let cnt: number = 1;

  for (let i = 0; i < chars.length; i++) {
    if (chars[i] !== chars[i + 1]) {
      chars[write] = chars[i]!;
      write++;
      if (cnt > 1) {
        let cntStr = cnt.toString();
        for (const num of cntStr.split("")) {
          chars[write] = num;
          write++;
        }
      }
      cnt = 1;
    } else {
      cnt++;
    }
  }

  return write;
}
