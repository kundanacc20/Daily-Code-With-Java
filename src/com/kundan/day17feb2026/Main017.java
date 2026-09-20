package com.kundan.day17feb2026;

import java.util.*;

public class Main017 {
    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 2, 2,2,2,3,3,3,3,3,3};
        int k = 2;
        System.out.println(topKFrequent(nums, k));
    }

//    public static List<Integer> topKFrequent(int[] nums, int k) {
//        HashMap<Integer, Integer> map = new HashMap<>();
//
//        //step 1: count frequency
//        for (int num : nums) {
//            map.put(num, map.getOrDefault(num, 0) + 1);
//        }
//        //step 2: convert map to list
//        List<Map.Entry<Integer, Integer>> list =
//                new ArrayList<>(map.entrySet());
//        //System.out.println(list);
//        //sort by frequency
//        Collections.sort(list, (a, b) ->
//                b.getValue() - a.getValue());
//        //collect top k elements
//        List<Integer> result = new ArrayList<>();
//
//        for (int i = 0; i < k; i++) {
//            result.add(list.get(i).getKey());
//        }
//        return result;
//    }

  public static List<Integer> topKFrequent(int[] nums, int k){
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num : nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        // Min haep based on frequency
      PriorityQueue<Integer> pq = new PriorityQueue<>((a,b) ->
              map.get(a)-map.get(b));

        for(int key: map.keySet()){
            pq.add(key);

            if(pq.size()>k){
                pq.poll();
            }
        }
        return new ArrayList<>(pq);
  }
}
