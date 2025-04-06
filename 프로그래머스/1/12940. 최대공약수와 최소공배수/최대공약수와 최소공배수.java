class Solution {
    public int[] solution(int n, int m) {
        int gcd = GCD(n, m);//최대공약수
        int lcm = n * m / gcd;
        return new int[]{gcd, lcm};
    }
        static int GCD(int n, int m) {

        if(n % m == 0) return m;
        
        return GCD(m, n % m);
    }




}