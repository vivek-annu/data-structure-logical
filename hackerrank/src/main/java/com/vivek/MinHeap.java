package com.vivek;

import java.util.Arrays;

/**
 * Created by Vivek on 7/28/2019.
 */
public class MinHeap {


    int ar[] = new int[10];
    int size = 0;
    int capacity = ar.length;

    public void add(int data) {
        if (size < capacity) {
            ar[size++] = data;

            int child = size - 1;
            int parent = (child - 1) / 2;

            minHeap(ar, parent, child);


        } else {
            int[] ints = new int[capacity * 2];
            for (int i = 0; i < ar.length; i++) {
                ints[i] = ar[i];
            }
            ar = ints;
            capacity = ar.length;
            add(data);
        }


    }


    public void delete(int data) {
        int parent = 0;
        for (int i = 0; i < size; i++) {
            if (ar[i] == data) {
                parent = i;
                break;
            }
        }

        ar[parent] = 0;
        int leftChild = (parent * 2) + 1;
        int rightChild = (parent * 2) + 2;
        if (ar[leftChild] < ar[rightChild]) {
           minHeapSort(ar,parent,leftChild);

        } else if (ar[leftChild] > ar[rightChild]) {
            minHeapSort(ar, parent,rightChild);
        }

    }

    private void minHeapSort(int[] ar, int parent, int child) {
        ar[parent]=ar[child];
        parent=child;


        int leftChild = (parent * 2) + 1;
        int rightChild = (parent * 2) + 2;

        if(leftChild<capacity&& rightChild<capacity) {
            if (ar[leftChild] < ar[rightChild]) {
                minHeapSort(ar, parent, leftChild);

            } else if (ar[leftChild] > ar[rightChild]) {
                minHeapSort(ar, parent, rightChild);
            }
        }
    }

    private void minHeap(int[] ar, int parent, int child) {
        if (ar[parent] > ar[child]) {
            int temp = ar[parent];
            ar[parent] = ar[child];
            ar[child] = temp;
            child = parent;
            parent = (child - 1) / 2;
            minHeap(ar, parent, child);
        }
    }

    public static void main(String[] args) {
        MinHeap heap = new MinHeap();
        System.out.println(Arrays.toString(heap.ar));
        heap.add(12);
        heap.add(5);
        heap.add(15);
        heap.add(14);
        heap.add(56);
        heap.add(10);

        System.out.println(Arrays.toString(heap.ar));
         heap.delete(5);
        System.out.println(Arrays.toString(heap.ar));
    }


}
