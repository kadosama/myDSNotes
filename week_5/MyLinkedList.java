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
        
        DoubleLinkedList myList = new DoubleLinkedList();
        
        myList.printList();

        
        for(int i = 0; i < 8; i =i + 2 ){    
            Node newNode = new Node(i,"Node " + (i));
            myList.addNode(newNode); 
        }
        
        myList.printList();
        System.out.println("-----------------------------------------------------------------------");
        Node n3 = new Node(3,"Node 3");
        myList.addNodeOrder(n3);
        myList.printList();
        

    }
    
}
