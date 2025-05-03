
class Solution {
    public int solution(int[] nums) {
        for(int i = 0; i < nums.length; i++){
            recur(nums, i+1, nums[i]);
        }

        return cnt;
    }
    static int cnt = 0;

    static void recur(int[] arr, int idx, int sum){

        for(int i = idx; i < arr.length; i++){
            int cur = sum + arr[i];
            for(int j = i+1; j < arr.length; j++){
                cur += arr[j];
                isPrime(cur);
                cur = sum + arr[i];
            }
        }
    }

    static void isPrime(int num){
        boolean flag = true;
        for(int i = 2; i <= num / 2 ; i++){
            if(num % i == 0){
                flag = false;
                break;
            }
        }
        if(flag){
            cnt++;
        }
    }
}