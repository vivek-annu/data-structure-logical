package com.vivek.ds;

/**
 * Created by Vivek on 7/22/2019.
 */
public class BinaryTree {

    Node root;


    public void add(int data) {
        root = add(root, data);
    }

    private Node add(Node root, int data) {
        Node node = new Node(data);
        if (root == null)
            root = node;
        else {
            if (root.data > data) {
                root.left = add(root.left, data);
            } else root.right = add(root.right, data);
        }
        return root;
    }

    public boolean search(int data) {
        return search(root, data);
    }

    private boolean search(Node root, int data) {
        boolean found = false;
        if (root == null) {
            return found = false;
        }
        while (root != null && !found) {
            if (root.data == data) {
                found = true;
                break;
            } else if (root.data > data) {
                root = root.left;
            } else root = root.right;
            found = search(root, data);
        }
        return found;
    }

    public void delete(int data) {
        root = delete(root, data);
    }

    private Node delete(Node root, int data) {

        if(root==null){
            return  null;
        }else{

            if(root.data==data){
                if(root.left!=null && root.right!=null){
                    if(root.data>root.right.data){

                    }




                }else if(root.left!=null){

                }else if(root.right!=null){

                }

            }else if(root.data>data){
                root=root.left;
            }else{
                root=root.right;
            }

            root= delete(root, data);



        }

        return root;
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.add(8);
        tree.add(3);
        tree.add(6);
        tree.add(16);
        tree.add(4);
        tree.add(7);
        tree.add(1);
        tree.add(14);
        tree.add(13);
        System.out.println(tree.search(5));

        System.out.println(tree.root);
    }

    class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "data=" + data +
                    ", left=" + left +
                    ", right=" + right +
                    '}';
        }
    }

}

