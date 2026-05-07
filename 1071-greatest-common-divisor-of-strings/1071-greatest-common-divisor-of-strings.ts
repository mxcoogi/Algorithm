function gcdOfStrings(str1: string, str2: string): string {
  let result: string = "";

  let minLen: number = Math.min(str1.length, str2.length);

  for (let i = 1; i <= minLen; i++) {
    let pattern: string = str1.slice(0, i);
    let isPrefix = canDivision(str1, pattern) && canDivision(str2, pattern);
    if(isPrefix){
        result = pattern;
    }
  }

  return result;
}

const canDivision = (str: string, pattern: string): boolean => {
  let strLen: number = str.length;
  let patternLen: number = pattern.length;

  if (strLen % patternLen !== 0) {
    return false;
  }

  let cnt: number = strLen / patternLen;
  let reapetStr: string = pattern.repeat(cnt);
  if (reapetStr === str) {
    return true;
  }

  return false;
};
