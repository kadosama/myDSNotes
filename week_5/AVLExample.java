
package avlexample;

public class AVLExample {

    public static void main(String[] args) {
        
        AVLTree myAVL = new AVLTree(1);
        myAVL.insertNodeAVL(2);
        myAVL.insertNodeAVL(3);
        myAVL.insertNodeAVL(4);
        myAVL.printPreOrder();

        
        myAVL.insertNodeAVL(5);
        
        System.out.println("\nAfter 5 inserted: ");
        myAVL.printPreOrder();
        
        System.out.println("\nAfter 6 inserted: ");
        myAVL.insertNodeAVL(6);
        myAVL.printPreOrder();
        
        System.out.println("\nAfter 7 inserted: ");
        myAVL.insertNodeAVL(7);
        myAVL.printPreOrder();
        
        System.out.println("\nDepth of Tree: " + myAVL.getRoot().getDepth());
        System.out.println("Depth of root->right: " + myAVL.getRoot().getRight().getDepth());
        System.out.println("Balance Value of root->Right: " + myAVL.balanceValue(myAVL.getRoot().getRight()));
        
        
    }
    
}
