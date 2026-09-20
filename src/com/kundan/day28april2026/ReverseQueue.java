package com.kundan.day28april2026;

import java.util.Queue;

public class ReverseQueue {
    static void reverse(Queue<Integer> q){
        if(q.isEmpty())
            return;
        int x = q.poll();
        reverse(q);
        q.add(x);
    }
}
