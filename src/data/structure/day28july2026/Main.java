package data.structure.day28july2026;

public class Main {
    public static void main(String[] args){
        //start timer
        long startTimer = System.nanoTime();
        char[][] grid = GridInput.sampleGrid();

        NumberOfIslands solver = new NumberOfIslands();
        int result = solver.numIslands(grid);

        System.out.println("Number of Islands: "+result);
        //end timer
        long endTimer = System.nanoTime();

        //program time
        long programTime = (endTimer - startTimer)/1_000_000;

        System.out.println("Program Time: "+programTime+" ms");
    }
}
