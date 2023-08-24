/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mylinkedlist;

/**
 *
 * @author acahit
 */
public class LinkedList {
    
    public Node head;
    public int  size;
    
    public LinkedList(){
        
        this.head   = null; 
        this.size   = 0; 
    }
    public boolean isEmpty(){
        
        return (this.head == null);
    }
    public void addNode(Node newNode){
      
      Node current = this.head;
      
      if(current == null){
          this.head = newNode;
          this.size++ ;
      }
      else{
            while(current.next != null){
                current = current.next;
            }
            current.next = newNode;
            this.size++ ;
      }
    }
    public void deleteNode(int key){
        Node currNode   = this.head;
        Node prevNode   = null;
        
       // If searched node is head 
       if(currNode != null && currNode.id == key){
                
           this.size--;
           System.out.println("Element has id "+ currNode.id + " founded and deleted");
           this.head = currNode.next;
       }
       //else 
       else{
            while (currNode != null && currNode.id != key) {
                // If currNode does not hold key
                // continue to next node
                prevNode = currNode;
                currNode = currNode.next;
            }
            //If we found the key this is current Node
            if (currNode != null){
                prevNode.next = currNode.next;
                
                this.size--;
                System.out.println("Element has id "+ currNode.id + " founded and deleted");
            }
            //If current node is the null, we didn't find the key value in the list...
            if (currNode == null){
                System.out.println(key + " not found in the list");
            }
       }
                     
    }
    public void printList(){
        
        Node currNode = this.head;
    
        System.out.println("LinkedList: ");
    
        // Traverse through the LinkedList
        while (currNode != null) {
            // Print the data at current node
            System.out.print(" {id:" + currNode.id + "   " + currNode.name + "}  --->");
    
            // Go to next node
            currNode = currNode.next;
        }
        System.out.println("");
          
    }
    
  
    
}
