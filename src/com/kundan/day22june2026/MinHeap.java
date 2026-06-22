package com.kundan.day22june2026;

public class MinHeap {
    private int[] heap;
    private int size;
    private int capacity;

    public MinHeap(int capacity){
        this.capacity = capacity;
        heap = new int[capacity];
        size =0;
    }

    private int parent(int i){
        return (i - 1)/2;
    }

    private int left(int i){
        return 2*i+1;
    }

    private int right(int i){
        return 2*i+2;
    }

    public void insert(int value){
        if(size == capacity){
            System.out.println("heap is full");
            return;
        }
        heap[size] = value;
        int current = size;
        size++;

        while (current > 0 && heap[current] <heap[parent(current)]){
            HeapUtils.swap(heap,current,parent(current));
            current = parent(current);
        }
    }
    public void print(){
        for(int i =0; i<size; i++){
            System.out.println(heap[i]+" ");
        }
        System.out.println();
    }
}
