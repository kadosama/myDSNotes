/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package binarytreeexample;

/**
 *
 * @author acahit
 */
public class BinaryTreeExample {

    public static void main(String[] args) {
        
        BTree myTree = new BTree();
        
        myTree.setRoot(new Node(6));
        
        myTree.insertIteratively(4);
        myTree.insertIteratively(8);
        myTree.insertIteratively(3);
        myTree.insertIteratively(5);
        
        myTree.insertRecursively(7, myTree.getRoot());
        myTree.insertRecursively(9,myTree.getRoot());

        
        System.out.println("Traversal of Preorder: ");
        myTree.printPreOrder(myTree.getRoot());
        
        System.out.println("\n Traversal of Inorder: ");
        myTree.printInOrder(myTree.getRoot());
        
        System.out.println("\n Traversal of PostOrder: ");
        myTree.printPostOrder(myTree.getRoot());
       
    }
    
}
