package DSA.Graph;
import java.util.*;

class Graph_{
    int vertices;
    List<List<Integer>> adjList;
    Graph_(int vertex){
        vertices = vertex;
        adjList = new ArrayList<>();

        for(int i=0; i<vertices; i++){
            adjList.add(new ArrayList<>());
        }
    }

    void addEdge(int src, int dest){
        adjList.get(src).add(dest);
        adjList.get(dest).add(src);
    }

    public void dfs(int node, boolean[] visited){
        visited[node] = true;
        System.out.print(node + " ");

        for(int neighbor : adjList.get(node)){
            if(!visited[neighbor]){
                dfs(neighbor, visited);
            }
        }
    }

    public void bfs(int start){
        boolean[] visited = new boolean[vertices];
        Queue<Integer> queue = new LinkedList<>();

        visited[start]= true;
        queue.offer(start);

        while(!queue.isEmpty()){
            int node = queue.poll();
            System.out.print(node + " ");

            for(int neighbor : adjList.get(node)){
                if(!visited[neighbor]){
                    visited[neighbor] = true;
                    queue.offer(neighbor); 
                }
            }
        }
    }
}
public class BFS_DFS {
    public static void main(String[] args) {
        Graph_ gr = new Graph_(7);
        gr.addEdge(1, 0);
        gr.addEdge(0, 2);
        gr.addEdge(6, 0);
        gr.addEdge(1, 5);
        gr.addEdge(3, 4);
        gr.addEdge(2, 3);
        gr.bfs(0);
        System.out.println();
        boolean []visit = new boolean[7];
        gr.dfs(0, visit);
    }
}
