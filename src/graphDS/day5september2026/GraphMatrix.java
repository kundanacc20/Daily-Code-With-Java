package graphDS.day5september2026;

public class GraphMatrix {
    private int vertices;
    private int[][] matrix;

    public GraphMatrix(int vertices){
        this.vertices = vertices;
        matrix = new int[vertices][vertices];
    }

    public void addEdge(int src, int dest){
        matrix[src][dest] = 1;
        matrix[dest][src] = 1;
    }

    public void addWeightedEdge(int src, int dest, int weight){
        matrix[src][dest] = weight;
        matrix[dest][src] = weight;
    }

    public int[][] getMatrix(){
        return matrix;
    }
}
