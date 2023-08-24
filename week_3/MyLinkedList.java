/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mylinkedlist;

/**
 *
 * @author acahit
 */
public class MyLinkedList {


    public static void main(String[] args) {
        
        Node n1 = new Node(0, "Node 1");
        LinkedList myList = new LinkedList();
        
        myList.printList();
        myList.addNode(n1);
        
        for(int i = 1; i < 8; i++){    
            Node newNode = new Node(i,"Node " + (i+1));
            myList.addNode(newNode); 
        }
        
        myList.printList();
        System.out.println("-----------------------------------------------------------------------");
        myList.deleteNode(8);
        myList.printList();
        

    }
    
}
