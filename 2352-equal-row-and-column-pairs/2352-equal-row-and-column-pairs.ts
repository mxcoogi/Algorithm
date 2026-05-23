function equalPairs(grid: number[][]): number {
  let n: number = grid.length;
  let map: Map<string, number> = new Map();
  let result: number = 0;
  for (let i = 0; i < n; i++) {
    const row: string = grid[i]!.join(",");
    map.set(row, (map.get(row) ?? 0) + 1);
  }

  for (let i = 0; i < n; i++) {
    const col: number[] = [];
    for (let j = 0; j < n; j++) {
      col.push(grid[j]![i]!);
    }
    const key = col.join(",");
    result += map.get(key) ?? 0;
  }

  return result;
}