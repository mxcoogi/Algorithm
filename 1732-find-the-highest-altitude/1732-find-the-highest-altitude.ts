function largestAltitude(gain: number[]): number {
  let high: number[] = [0];
  let max: number = high[0]!;
  for (let i = 0; i < gain.length; i++) {
    let next: number = high[i]! + gain[i]!;
    if (max <= next) {
      max = next;
    }
    high.push(next);
  }
  return max;
}