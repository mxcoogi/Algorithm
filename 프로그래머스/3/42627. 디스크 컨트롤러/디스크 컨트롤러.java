import java.util.*;

class Solution {
    public int solution(int[][] jobs) {
        PriorityQueue<Job> pq = new PriorityQueue<>(
                Comparator.comparingInt((Job job) -> job.duration)
                        .thenComparingInt((Job job) -> job.requestAt)
                        .thenComparingInt((Job job) -> job.number)
        );
        PriorityQueue<Job> pq2 = new PriorityQueue<>(
                Comparator.comparingInt((Job job) -> job.requestAt)
        );
        for (int i = 0; i < jobs.length; i++) {
            pq2.add(new Job(i, jobs[i][0], jobs[i][1]));
        }
        int ms = 0;
        int[] avg = new int[jobs.length];
        while (!pq.isEmpty() || !pq2.isEmpty()) {
            while (!pq2.isEmpty() && pq2.peek().requestAt <= ms) {
                pq.add(pq2.poll());
            }
            if(pq.isEmpty() && !pq2.isEmpty()){
                ms = pq2.peek().requestAt;
                continue;
            }
            Job poll = pq.poll();
            if(poll.requestAt > ms){
                ms = poll.requestAt;
            }
            ms += poll.duration;
            avg[poll.number] = ms - poll.requestAt;
        }
        return Arrays.stream(avg).sum()/ avg.length;
    }
    static class Job{
        int number; //3
        int requestAt; //2
        int duration; //1
        public Job(int number, int requestAt, int duration) {
            this.number = number;
            this.requestAt = requestAt;
            this.duration = duration;
        }
    }
}
