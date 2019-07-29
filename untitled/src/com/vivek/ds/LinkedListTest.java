package com.vivek.ds;

/**
 * Created by Vivek on 7/24/2019.
 */
public class LinkedListTest {

    Node head;

    public Node add(int data) {
        Node node = new Node(data);
        if (head == null)
            return head = node;

        Node headPoint = head;
        while (headPoint.next != null) {
            headPoint = headPoint.next;
        }
        headPoint.next = node;


        return head;
    }

    public Node delete(int data) {

        if (head == null)
            return null;

        if (head.data == data) {
            return head = head.next;

        }
        Node node = head;
        while (node != null) {

            if (node.data == data) {

                break;

            }


            node = node.next;

        }


        return head;
    }

    public void printData() {
        Node node = head;
        System.out.print("[ ");
        while (node != null) {
            System.out.print(node.data + " , ");
            node = node.next;
        }
        System.out.print(" ]");
        System.out.println();
    }


    public static void main(String[] args) {

        LinkedListTest test = new LinkedListTest();
        test.add(12);
        test.add(23);
        test.add(354);
        test.add(464);
        test.delete(23);
        test.printData();
    }

    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "data=" + data +
                    ", next=" + next +
                    '}';
        }
    }


}
