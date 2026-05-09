function canPlaceFlowers(flowerbed: number[], n: number): boolean {
  let cnt: number = 0;

  for (let i = 0; i < flowerbed.length; i++) {
    let isHere: boolean = checkHere(flowerbed, i);
    if(isHere){
        cnt++;
        flowerbed[i] = 1;
    }
  }
  let result: boolean = cnt >= n;
  return result;
}
function checkFront(flowerbed: number[], idx: number): boolean {
  if (idx + 1 === flowerbed.length) {
    return true;
  }
  if (flowerbed[idx + 1] === 0) {
    return true;
  }
  return false;
}
function checkBack(flowerbed: number[], idx: number): boolean {
  if (idx - 1 === -1) {
    return true;
  }
  if (flowerbed[idx - 1] === 0) {
    return true;
  }
  return false;
}
function checkHere(flowerbed: number[], idx: number): boolean {
  let here = flowerbed[idx];
  if (here === 1) {
    return false;
  }
  return checkBack(flowerbed, idx) && checkFront(flowerbed, idx);
}
