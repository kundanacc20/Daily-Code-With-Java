package graphDS.day5september2026;

public class GraphUtils {
    public static boolean hasEdge(GraphMatrix graph, int src, int dest){
        return graph.getMatrix()[src][dest] != 0;
    }

    public static void printGraph(GraphMatrix graph){
        int[][] matrix = graph.getMatrix();
        for(int[] row : matrix){
            for(int val : row){
                System.out.print(val+" ");
            }
            System.out.println();
        }
    }
}
