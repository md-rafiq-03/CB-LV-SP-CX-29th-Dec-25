package graph;

import java.util.*;

public class GraphRepByAdjacencyList {
    int vertices;
    List<Integer>[] adjList;
    List<List<Integer>> adj2;
    Map<Integer, List<Integer>> adj3;

    public GraphRepByAdjacencyList(int vertices){
        this.vertices = vertices;
        adjList = new List[vertices+1];
        adj2 = new ArrayList<>();
        for(int i=0;i<vertices+1;i++){
            adjList[i] = new ArrayList();
            adj2.add(new ArrayList<>());
            adj3 = new HashMap<>();
            //adj3.put(i, new ArrayList<>());
        }
    }

    public void addEgde(int u, int v){
        adjList[u].add(v);
        adj2.get(u).add(v);
       // adj3.get(u).add(v);
       // adjList[v].add(u);
        adj3.computeIfAbsent(u, k-> new ArrayList<>()).add(v);
    }

    public void print(){
        for(int node=1;node<=vertices;node++){
            List<Integer> list = adjList[node];
            System.out.print(node+"->");
            for(int e : list){
                System.out.print(e+", ");
            }
            System.out.println();
        }
    }

    public void bfs(int src){
        Queue<Integer> queue = new ArrayDeque<>();
        boolean[] visited = new boolean[vertices+1];
        queue.add(src);
        visited[src] = true;

        while(!queue.isEmpty()){
            int size = queue.size();
            while(size-->0){
                int node = queue.poll();
                System.out.print(node+", ");

                for(int e : adjList[node]){
                    if(!visited[e]){
                        queue.add(e);
                        visited[e] = true;
                    }
                }
            }
        }
    }

    public void dfs(int src){
        dfs(src, new boolean[vertices+1]);
    }

    public void dfs(int src, boolean[] visited){
        visited[src] = true;
        System.out.print(src +", ");
        for(int nbr : adjList[src]){
            if(!visited[nbr]){
                dfs(nbr, visited);
            }
        }
    }

}
