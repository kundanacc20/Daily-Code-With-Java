package graphDS.day6september2026;

import java.util.ArrayList;
import java.util.List;

public class GraphList {
    private int vertices;
    private List<List<Integer>> adjList;

    public GraphList(int vertices){
        this.vertices = vertices;
        adjList = new ArrayList<>();
        for(int i = 0; i<vertices; i++){
            adjList.add(new ArrayList<>());
        }
    }
    //undirected graph
    public void addEdge(int src, int dest){
        adjList.get(src).add(dest);
        adjList.get(dest).add(src);
    }

    public List<List<Integer>> getAdjList(){
        return adjList;
    }

    public int getVertices(){
        return vertices;
    }
}
