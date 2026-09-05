package graphDS.day5september2026;

public class Main {
    public static void main(String[] args){
        //start timer
        long startTimer = System.nanoTime();
        GraphMatrix g = new GraphMatrix(4);

        g.addEdge(0,2);
        g.addEdge(0,3);
        g.addEdge(1,2);
        g.addEdge(2,3);

        GraphUtils.printGraph(g);

        System.out.println("edges between 0 and 2 :"+GraphUtils.hasEdge(g,0,2));
        //end timer
        long endTimer = System.nanoTime();

        //program time
        long programTime = (endTimer - startTimer)/1_000_000;

        System.out.println("program time: "+programTime+" ms");
    }
}
