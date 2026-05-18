function uniqueOccurrences(arr: number[]): boolean {
  let map: Map<number, number> = new Map();
  let set: Set<number> = new Set();
  for (let i = 0; i < arr.length; i++) {
    if (!map.has(arr[i]!)) {
      map.set(arr[i]!, 0);
    }
    map.set(arr[i]!, map.get(arr[i]!)! + 1);
  }
  for (const count of map.values()) {
    set.add(count);
  }
  if (set.size !== map.size) {
    return false;
  }
  return true;
}
