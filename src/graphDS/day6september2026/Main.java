package graphDS.day6september2026;

public class Main {
    public static void main(String[] args){
        //start timer
        long startTimer = System.nanoTime();
        GraphList g = new GraphList(5);

        g.addEdge(0, 1);
        g.addEdge(0, 4);
        g.addEdge(1, 2);
        g.addEdge(1, 3);
        g.addEdge(1, 4);
        g.addEdge(2, 3);
        g.addEdge(3, 4);

        GraphUtils.printGraph(g);

        System.out.println("Edge between 0 and 2? " + GraphUtils.hasEdge(g, 0, 2));
        //end timer
        long endTimer = System.nanoTime();

        //program timer
        long programTime = (endTimer - startTimer)/1_000_000;

        System.out.println("Program time: "+programTime+" ms");
    }
}
