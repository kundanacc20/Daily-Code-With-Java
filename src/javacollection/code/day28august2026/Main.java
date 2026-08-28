package javacollection.code.day28august2026;

import java.util.*;

public class Main {
    public static void main(String[] args){
        //start timer
        long startTimer = System.nanoTime();
        /*Problem 6: Find common elements between two lists
        Input:
        List 1 = [10, 20, 30, 40]
        List 2 = [30, 40, 50, 60]

        Output:
        [30, 40]
        Concept: HashSet
         */
       /* List<Integer> list1 = Arrays.asList(1,10,20,30,40);
        List<Integer> list2 = Arrays.asList(1,30,40,50,60);

//        Set<Integer> commonElement = new HashSet<>();
//
//        for(Integer e : list2)
//        {
//            if(list1.contains(e)){
//                commonElement.add(e);
//            }
//        }
//        System.out.println(commonElement);

        Set<Integer> set2 = new HashSet<>(list1);

        List<Integer> common = new ArrayList<>();

        for (Integer e : list2){
            if(set2.contains(e)){
                common.add(e);
            }
        }
        System.out.println(common);
        */
/*Problem 7: Find union of two lists
Input:
[1, 2, 3, 4]
[3, 4, 5, 6]

Output:
[1, 2, 3, 4, 5, 6]
Concept: Set
*/
        /*List<Integer> list1 = Arrays.asList(1,2,3,4,5);
        List<Integer> list2 = Arrays.asList(6,7,8,9,10);

        Set<Integer> unionOfList = new HashSet<>(list1);
        for(Integer e : list2){
            unionOfList.add(e);
        }
        System.out.println(unionOfList);
         */
        //end timer
        long endTimer = System.nanoTime();

        //program time
        long programTime = (endTimer - startTimer)/1_000_000;

        System.out.println("Program time: "+programTime+" ms");
    }
}
