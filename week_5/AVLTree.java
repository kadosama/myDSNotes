/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package avlexample;

import static java.lang.Math.max;


/**
 *
 * @author acahit
 */
public class AVLTree {

    
        private Node root;

        public AVLTree(int data){
            this.root = new Node(data);
        }
        //Insertion with findings depths..
        public void insertRecursively(int newData){ insertRecursively(newData,this.root);}
        public Node insertRecursively(int newData, Node root){   
            if(root == null){
                root = new Node(newData);
                return root;
            }  
            if(root.getData() > newData){   
                root.setLeft(insertRecursively(newData, root.getLeft()));
                this.updateDepth(root.getLeft());
                root.setLeft(this.rebalance(root.getLeft()));
            }
            else{
                root.setRight(insertRecursively(newData, root.getRight())); 
                this.updateDepth(root.getRight());
                root.setRight(this.rebalance(root.getRight()));

            }
            
            this.updateDepth(root);
            return root;
        }
        public void printPreOrder(){ printPreOrder(this.getRoot());}
        public void printPreOrder(Node current){
        
        if(current == null)
            return;    
        
        System.out.print(current.getData() + " ");
        printPreOrder(current.getLeft());
        printPreOrder(current.getRight());
    }
                
    public int balanceValue(Node node){
        return depth(node.getRight()) - depth(node.getLeft());
    }
    public int depth(Node node){
        if(node != null)
            return node.getDepth();
        return -1;
    }

    public void updateDepth(Node node){
        
        int leftChildDepth = depth(node.getLeft());
        int rightChildDepth = depth(node.getRight());
        
        node.setDepth(max(leftChildDepth, rightChildDepth) + 1);
        
    }
    public void insertNodeAVL(int key){ root = insertNodeAVL(key,root);}
    public Node insertNodeAVL(int key, Node node){
        
        node = insertRecursively(key, node);

        return rebalance(node);
    }
    
    public Node rotateRight(Node node) {
        
        Node leftChild = node.getLeft();

        node.setLeft(leftChild.getRight());
        leftChild.setRight(node);

        updateDepth(node);
        updateDepth(leftChild);

        return leftChild;
    }
    public Node rotateLeft(Node node){
        
        Node rightChild = node.getRight();
        
        node.setRight(rightChild.getLeft());
        rightChild.setLeft(node);
        
        updateDepth(node);
        updateDepth(rightChild);
        
        return rightChild;
    }
    
    public Node rebalance(Node node) {
        
        if(node == null)
            return null;
        
        int balanceValue = balanceValue(node);

        // Left-heavy?
        if (balanceValue < -1) {
          if (balanceValue(node.getLeft()) <= 0) {    // Case 1
            // Rotate right
            node = rotateRight(node);
          } else {                                // Case 2
            // Rotate left-right
            node.setLeft(rotateLeft(node.getLeft()));
            node = rotateRight(node);
          }
        }

        // Right-heavy?
        if (balanceValue > 1) {
          if (balanceValue(node.getRight()) >= 0) {    // Case 3
            // Rotate left
            node = rotateLeft(node);
          }else{                                 // Case 4
            // Rotate right-left
            node.setRight(rotateRight(node.getRight()));
            node = rotateLeft(node);
          }
        }

        return node;
    }
    
        
    public Node getRoot() {
        return root;
    }

    public void setRoot(Node root) {
        this.root = root;
    }

}
