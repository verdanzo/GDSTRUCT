package com.company;

public class Node {

    private int data;
    private Node right;
    private Node left;



    public void insert(int value){
        if(value == data){
            return;
        }
        if(value < data){
            if(left == null){
                left = new Node(value);
            }
            else{
                left.insert(value);
            }

        }
        else{
            if(right == null){
                right = new Node(value);
            }
            else{
                right.insert(value);
            }
        }
    }

    public void traverseInOrder(){
        if (right != null){
            right.traverseInOrder();
        }
        System.out.println("Data: " + data);
        if (left != null){
            left.traverseInOrder();
        }
    }

    public Node get(int value){
        if (value == data){
            return this;
        }
        if  (value < data){
            if (left != null){
                return left.get(value);
            }
        }
        else{
            if (right != null){
                return right.get(value);
            }
        }
        return null;
    }

    public void Max() {
        if (right != null) {
            right.Max();
        }
        else{
            System.out.println("MAX: " + data);
        }
    }
    public void Min() {
        if (left != null) {
            left.Min();
        }
        else{
            System.out.println("Min: " + data);
        }
    }

    public Node(int _data){
        this.data = _data;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    @Override
    public String toString() {
        return "Node{" +
                "data=" + data +
                '}';
    }
}
