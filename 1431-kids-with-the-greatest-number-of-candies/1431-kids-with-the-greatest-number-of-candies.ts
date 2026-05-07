function kidsWithCandies(candies: number[], extraCandies: number): boolean[] {
    let result: boolean[] = [];
    let max: number = 0;
    let candy
    for(let i = 0; i < candies.length; i++){
        result.push(false);
        candy = candies[i];
        if (candy === undefined) {
        continue;
        }
        if (max <= candy) {
            max = candy;
        }
    }
    for(let i = 0; i < candies.length; i++){
        candy = candies[i];
        if (candy === undefined) {
        continue;
        }
        if(candy + extraCandies >= max){
            result[i] = true;
        }
    }
    return result
};