package com.vivek;

/**
 * Created by Vivek on 7/29/2019.
 */
public class SinglyLinkedList {
    Node head;

    public void rotate(int position) {

    }


    public Node reverse(Node node) {
        if (node == null || node.next == null) {
            return node;
        }
        Node temp = reverse(node.next);
        node.next.next = node;
        node.next = null;
        return temp;
    }

    public boolean search(int data) {
        boolean found = false;
        if (head == null) return found = false;
        Node node = head;
        while (node != null) {
            if (node.data == data) {
                found = true;
                break;
            }
            node = node.next;
        }
        return found;
    }

    public Node deleteLast() {
        if (head == null && head.next == null) {
            return null;
        }
        Node node = head;

        while (node.next.next != null) {
            node = node.next;
        }
        node.next = null;


        return head;

    }

    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();
        list.add(12);
        list.add(1);
        list.add(142);
        list.add(34);
        list.add(9);
        list.add(1492);
        System.out.println(list.head);
//        list.deleteFirst();
//        list.deleteFirst();
       // list.deleteLast();
        list.reverse(list.head);
        System.out.println(list.head);
        // System.out.println(list.search(149));


    }

    public void deleteFirst() {
        if (head == null) {
            System.out.println("list is empty");
            return;
        } else {
            head = head.next;
        }
    }

    private void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        } else {

            Node node = head;
            while (node.next != null) {
                node = node.next;
            }
            node.next = newNode;
            return;


        }
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
