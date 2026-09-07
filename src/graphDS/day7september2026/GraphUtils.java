package graphDS.day7september2026;

public class GraphUtils {
    public static void printGraph(WeightedGraph graph){
        for(int vertex : graph.getAdjList().keySet()){
            System.out.println("vertex: "+vertex+" -> ");
            for(Edge e: graph.getAdjList().get(vertex)){
                System.out.println("("+e.getDestination()+",w="+e.getWeight()+") ");
            }
            System.out.println();
        }
    }
}
