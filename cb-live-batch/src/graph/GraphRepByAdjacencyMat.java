package graph;

import java.util.ArrayDeque;
import java.util.Queue;

public class GraphRepByAdjacencyMat {
    int vertices;
    int[][] graph;
    public GraphRepByAdjacencyMat(int vertices){
        this.vertices = vertices;
        graph = new int[vertices+1][vertices+1];
    }

    public void addEgde(int u, int v){
        this.graph[u][v] = 1;
        this.graph[v][u] = 1;
    }

    void printNeighbours(){
        for(int node = 1; node <= vertices;node++){
            System.out.print(node + "-> ");
            for(int nbr =0 ; nbr <= vertices ; nbr++){
                if(graph[node][nbr]==1){
                    System.out.print(nbr + ", ");
                }
            }
            System.out.println();
        }
    }

    public void bfs(int src){
        Queue<Integer> queue = new ArrayDeque<>();
        boolean[] visited = new boolean[vertices+1];

        queue.add(src);
        visited[src] = true;

        while (!queue.isEmpty()){
            int size = queue.size();
            while (size-->0){
                int node = queue.poll();
                System.out.print(node+", ");
                for(int nbr =0 ; nbr <= vertices ; nbr++){
                    if(graph[node][nbr]==1 &&  !visited[nbr]){
                        queue.add(nbr);
                        visited[nbr]=true;
                    }
                }
            }
            System.out.println();
        }
    }

    public void dfs(int src){
        System.out.print(src +", ");
        dfs(src, new boolean[vertices+1]);
    }

    private void dfs(int src, boolean[] vis){
        vis[src] = true;
        for(int nbr =0 ; nbr <= vertices ; nbr++){
            if(graph[src][nbr]==1 && !vis[nbr]){
                System.out.print(nbr + ", ");
                dfs(nbr, vis);
            }
        }
    }

}
