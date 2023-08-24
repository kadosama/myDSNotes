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
        
        myTree.setRoot(new Node(40));
        
        myTree.insertIteratively(30);
        myTree.insertIteratively(50);
        myTree.insertIteratively(20);
        myTree.insertIteratively(35);



        
        //myTree.setRoot(myTree.deleteNode(myTree.getRoot(),40));
        
        System.out.println("Traversal of Preorder: ");
        myTree.printPreOrder(myTree.getRoot());
        
        System.out.println("\n Traversal of Inorder: ");
        myTree.printInOrder(myTree.getRoot());
        
        System.out.println("\n Traversal of PostOrder: ");
        myTree.printPostOrder(myTree.getRoot());
        
        
        System.out.println("\nLeaf Nodes number:  " + myTree.leafNumber(myTree.getRoot()) + "  " );
        
        System.out.println("Depth of a tree is : " + myTree.findDepth(myTree.getRoot()));
        
        System.out.println("Depth of a left sub-tree: " + myTree.findDepth(myTree.getRoot().getLeft()));
        System.out.println("Depth of a right sub-tree: " + myTree.findDepth(myTree.getRoot().getRight()));
        
    }
    
}
