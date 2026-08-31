import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

class Solution {
    Set<Integer> set = new HashSet<>();
    public int solution(String numbers) {
        AtomicInteger answer = new AtomicInteger();
        int max = 9_999_999;
        boolean[] isPrime = new boolean[max + 1];
        Arrays.fill(isPrime, true);
        isPrime[0] = false;
        isPrime[1] = false;
        for (int i = 2; i * i <= max; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= max; j += i) {
                    isPrime[j] = false;
                }
            }
        }
        dfs(numbers, "", new boolean[numbers.length()]);
        set.stream().forEach(e -> {
            if(isPrime[e]) {
                answer.getAndIncrement();
            }
        });

        return answer.get();
    }
    public void dfs(String numbers, String current, boolean[] visited) {
        for (int i = 0; i < numbers.length(); i++) {
            if (visited[i]) continue;
            visited[i] = true;
            String next = current + numbers.charAt(i);
            set.add(Integer.parseInt(next));
            dfs(numbers, next, visited);
            visited[i] = false;
        }
    }

    public boolean getPrimes(){
        List<Integer> primes = new ArrayList<>();
        primes.add(2); primes.add(3);
        for(int i = 0; i < 9999999; i++){

        }
        return false;
    }
}