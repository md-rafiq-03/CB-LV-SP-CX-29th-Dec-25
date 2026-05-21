package graph;

public class GraphClient {
    public static void main(String[] args) {
//        GraphRepByAdjacencyMat  graph = new GraphRepByAdjacencyMat(5);
//        graph.addEgde(1, 2);
//        graph.addEgde(1, 4);
//        graph.addEgde(1, 3);
//        graph.addEgde(2, 1);
//        graph.addEgde(2, 3);
//        graph.addEgde(2, 5);
//        graph.addEgde(3, 1);
//        graph.addEgde(3, 2);
//        graph.addEgde(3, 4);
//        graph.addEgde(4, 1);
//        graph.addEgde(4, 3);
//        graph.addEgde(4, 5);
//        graph.addEgde(5, 2);
//        graph.addEgde(5, 4);
//
//        graph.printNeighbours();
//        System.out.println("BFS");
//        graph.bfs(1);
//        System.out.println("DFS");
//        graph.dfs(1);
        GraphRepByAdjacencyList  graph = new GraphRepByAdjacencyList(5);
        graph.addEgde(1, 2);
        graph.addEgde(2, 5);
        graph.addEgde(3, 1);
        graph.addEgde(3, 2);
        graph.addEgde(3, 4);
        graph.addEgde(4, 1);
        graph.addEgde(4, 3);
        graph.addEgde(4, 5);
        graph.addEgde(5, 2);
        graph.addEgde(5, 4);
        graph.addEgde(1, 4);
        graph.addEgde(1, 3);
        graph.addEgde(2, 1);
        graph.addEgde(2, 3);

        graph.print();
        System.out.println("BFS");
        graph.bfs(1);
        System.out.println();
        System.out.println("DFS");
        graph.dfs(1);

    }
}
