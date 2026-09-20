package graphDS.day7september2026;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WeightedGraph {
    private int vertices;
    private Map<Integer, List<Edge>> adjList;
    private boolean directed;

    public WeightedGraph(int vertices, boolean directed){
        this.vertices = vertices;
        this.directed = directed;
        adjList = new HashMap<>();
        for(int i =0; i < vertices; i++){
            adjList.put(i, new ArrayList<>());
        }
    }
    public void addEdge(int src, int dest, int weight){
        adjList.get(src).add(new Edge(dest,weight));
        if(!directed){
            adjList.get(dest).add(new Edge(src,weight));
        }
    }

    public List<Edge> getNeighbors(int vertex){
        return adjList.get(vertex);
    }

    public Map<Integer,List<Edge>> getAdjList(){
        return adjList;
    }
}
