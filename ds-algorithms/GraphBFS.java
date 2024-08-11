import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

class Graph {
    int vertices;
    LinkedList<Integer>[] adjList;
    public Graph(int vertices){
        this.vertices = vertices;
        this.adjList=new LinkedList[vertices];
        for(int i=0;i<vertices;i++){
            adjList[i]=new LinkedList<Integer>();
        }

    }

    public void DFSRecur(int u,boolean[] visited){
        visited[u]=true;
        System.out.println("Visited"+u);
        Iterator<Integer> it=adjList[u].listIterator();
        while(it.hasNext()){
            int n=it.next();
            if(!visited[n]){
                DFSRecur(n,visited);
            }
        }
    }
    public void DFS(int u){
        boolean[] visited =new boolean[vertices];
        DFSRecur(u,visited);
    }

    public void addEdge(int u, int v){
        adjList[u].add(v);
    }
    public void BFS(int u){
        Queue<Integer> queue=new LinkedList<>();
        boolean[] visited=new boolean[vertices];

        visited[u]=true;
        queue.add(u);

        while (!queue.isEmpty()){
            int current=queue.poll();
            System.out.println("Current Node" + current);

            for(int neighbor : adjList[current]){
                if(!visited[neighbor]){
                    visited[neighbor]=true;
                    queue.add(neighbor);
                }
            }
        }
    }
}

public class GraphBFS {
    public static void main(String[] args) {
        int vertices=6;
        Graph G=new Graph(vertices);

        G.addEdge(0,1);
        G.addEdge(0,2);
        G.addEdge(1,3);
        G.addEdge(1,4);
        G.addEdge(2,4);
        G.addEdge(3,5);

        G.BFS(0);
        G.DFS(0);
    }
}
