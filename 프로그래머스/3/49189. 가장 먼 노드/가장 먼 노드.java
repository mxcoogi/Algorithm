import java.util.*;

class Solution {
    public int solution(int n, int[][] edge) {
        ListGraph graph = new ListGraph(n);
        boolean[] visited = new boolean[n];
        int[] degree = new int[n];
        Queue<Integer> queue = new LinkedList<>();

        for(int i = 0; i < edge.length; i++) {
            int x = edge[i][0];
            int y = edge[i][1];
            graph.put(x-1, y-1);
        }

        queue.add(0);
        int max = 0;
        while(queue.size() != 0) {
            int x = queue.poll();
            visited[x] = true;
            ArrayList<Integer> ints = graph.getListGraph().get(x);
            for(int i = 0; i < ints.size(); i++) {
                int y = ints.get(i);
                if(!visited[y]) {
                    degree[y] += degree[x]+1;
                    if(max < degree[y]){
                        max = degree[y];
                    }
                    visited[y] = true;
                    queue.add(y);
                }
            }
        }
        int answer = 0;
        for(int val : degree){
            if(max == val){
                answer++;
            }
        }
        return answer;
    }
}


class ListGraph {
    private ArrayList<ArrayList<Integer>> listGraph;

    public ListGraph(int initSize) {
        listGraph = new ArrayList<>();
        for (int i = 0; i < initSize; i++) {
            listGraph.add(new ArrayList<>());
        }
    }

    public void put(int x, int y){
        listGraph.get(x).add(y);
        listGraph.get(y).add(x);
    }

    public ArrayList<ArrayList<Integer>> getListGraph() {
        return listGraph;
    }

    public void print(){
        for (int i = 0; i < listGraph.size(); i++) {
            ArrayList<Integer> list = listGraph.get(i);
            System.out.print(i+1 + "의 인접 노드들 : ");
            for (Integer j : list) {
                System.out.print(j+1 + " ");
            }
            System.out.println();
        }
    }

}
