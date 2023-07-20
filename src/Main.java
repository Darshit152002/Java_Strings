import java.sql.SQLOutput;
import java.util.*;
public class Main {
    public static int solve(int A, int[][] B){
        // create an adjacency list representation of the given graph
        ArrayList<ArrayList<Integer>> adjList = new ArrayList<>();
        for(int i = 0; i <= A; i++){
            adjList.add(new ArrayList<>());
        }
        for(int[] edge : B){
            adjList.get(edge[0]).add(edge[1]);
        }
        // create a visited array to keep track if visited nodes
        boolean[] visited = new boolean[A + 1];

        // create a queue for BFS and add 1 to the queue
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(1);
        visited[1] = true;

        // Perform BFS
        while(!queue.isEmpty()){
            int node = queue.poll();
            if(node == A){
                return 1;
            }
            for(int next : adjList.get(node)){
                if(!visited[next]){
                    visited[next] = true;
                    queue.offer(next);
                }
            }
        }
        return 0;
    }
    public static void main(String[] args) {

    }
}