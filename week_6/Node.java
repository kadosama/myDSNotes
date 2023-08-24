/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package binarytreeexample;

/**
 *
 * @author acahit
 */
public class Node {
    
    private int data;
    private Node left;
    private Node right;
    
    public Node(int x){
        data    = x;
        left    = null;
        right   = null;
        
    }
    public void setLeft(Node l){
        left = l;
    }
    public void setRight(Node r){
        right = r;
    }
    public Node getLeft(){
        return left;
    }
    public Node getRight(){
        return right;
    }
    public int getData(){   return data;}
    public void setData(int d){  data = d;} 

}
