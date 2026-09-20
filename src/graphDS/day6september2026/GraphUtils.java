package graphDS.day6september2026;

import java.util.List;

public class GraphUtils {
    public static void printGraph(GraphList graph){
        List<List<Integer>> adjList = graph.getAdjList();
        for(int i =0; i < graph.getVertices(); i++){
            System.out.print("Vertex "+i+" : ");
            for(int neighbor : adjList.get(i)){
                System.out.print(neighbor+" ");
            }
            System.out.println();
        }
    }
    public static boolean hasEdge(GraphList graph, int src, int dest){
        return graph.getAdjList().get(src).contains(dest);
    }
}
