package com.vivek;

/**
 * Created by Vivek on 7/28/2019.
 */
public class BinaryTree {

    Node root;

    public void add(int data) {
        root = add(root, data);
    }

    public boolean search(int data) {
        return search(root, data);
    }

    public void delete(int data) {
        root = delete(root, data);


    }

    private Node delete(Node root, int data) {
        if (root == null) {
            System.out.println(" NOT FOUND == >");
            return root = null;
        } else {

            if (root.data == data) {

                if (root.left == null && root.right == null) {
                    return root = null;
                } else if (root.left == null && root.right != null) {
                    Node tempNode = findNodeToTakePlace(root.right);
                    root.data = tempNode.data;
                    root.right = delete(root.right, tempNode.data);
                    return root;

                } else if (root.right == null && root.left != null) {
                    Node tempNode = findNodeToTakePlace(root.left);
                    root.data = tempNode.data;
                    root.left = delete(root.left, tempNode.data);
                    return root;
                } else {
                    Node tempNode = findNodeToTakePlace(root.right);
                    root.data = tempNode.data;
                    root.right = delete(root.right, tempNode.data);

                    return root;
                }


            } else if (root.data > data) {
                root.left = delete(root.left, data);
            } else if (root.data < data)
                root.right = delete(root.right, data);


        }
        return root;
    }

    private Node findNodeToTakePlace(Node node) {
        if (node.left == null && node.right == null)
            return node;
        if (node.right == null && node.left != null)
            return findNodeToTakePlace(node.left);
        else if (node.left == null && node.right != null) {
            return findNodeToTakePlace(node.right);
        }

        return node;
    }

    private boolean search(Node root, int data) {
        boolean found = false;
        if (root == null) return found = false;
        if (root.data == data) return found = true;

        while (root != null && !found) {
            if (root.data > data) {
                found = search(root.left, data);
            } else if (root.data < data)
                found = search(root.right, data);
            else
                found = false;
            break;
        }


        return found;
    }

    private Node add(Node root, int data) {
        Node node = new Node(data);
        if (root == null)
            return root = node;

        if (root.data > data) {
            root.left = add(root.left, data);
        } else if (root.data < data) {
            root.right = add(root.right, data);
        }


        return root;

    }

    public  int height(Node root    ){
        if(root==null)return -1;
        else
            return max(height(root.left),height(root.right))+1;

    }
public int max(int a,int b){
        return a>b?a:b;
}

    public static void main(String[] args) {

        BinaryTree binaryTree = new BinaryTree();

        binaryTree.add(12);
        binaryTree.add(25);
        binaryTree.add(15);
        binaryTree.add(5);
        binaryTree.add(9);
        binaryTree.add(2);
        binaryTree.add(7);
        binaryTree.add(6);
        System.out.println(binaryTree.height(binaryTree.root));
        System.out.println(binaryTree.root);
        System.out.println(binaryTree.search(2));
        binaryTree.delete(5);
        System.out.println(binaryTree.root);

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
