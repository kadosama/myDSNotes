/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mylinkedlist;

/**
 *
 * @author acahit
 */
public class DoubleLinkedList {
    
    public Node head;
    public Node tail;
    public int  size;
    
    public DoubleLinkedList(){
        
        this.head   = null; 
        this.tail   = null;
        this.size   = 0; 
    }
    public boolean isEmpty(){
        
        return (this.head == null);
    }
    public void addNode(Node newNode){
 
      if(this.tail == null){
          this.head = newNode;
          this.tail = newNode;
          this.size++ ;
      }
      else{
          this.tail.next = newNode;
          newNode.prev = this.tail;
          this.tail = newNode;
          this.size++;
      }
    }
    public void deleteNode(int key){
        Node currNode   = this.head;
        
        
       // If searched node is head 
       if(currNode != null && currNode.id == key){
                
           this.size--;
           System.out.println("Element has id "+ currNode.id + " founded and deleted");
           this.head = currNode.next;
           this.head.prev = null;
       }
       //else 
       else{
           if(this.tail.id == key){
               this.size--;
               System.out.println("Element has id "+ this.tail.id + " founded and deleted");
               this.tail        = this.tail.prev;
               this.tail.next   = null;
               
           }else{
               
               while (currNode != null ) {
                   
                   if(currNode.id == key){
                       currNode.prev.next = currNode.next;
                       currNode.next.prev = currNode.prev;
                       this.size--;
                       System.out.println("Element has id "+ currNode.id + " founded and deleted");     
                       break;
                    }     
                    currNode = currNode.next;
               }
                
                if ( currNode == null)
                //If current node is the null, we didn't find the key value in the list...
                {
                    System.out.println(key + " not found in the list");
                }
           }
       }
                     
    }
    public void addNodeOrder(Node newNode){
        Node current = this.head;
        
        if(this.head.id   >  newNode.id){
            
            newNode.next    = this.head.next; 
            this.head       = newNode;
        }else{
                while(current != null && current.id < newNode.id){
                    current = current.next;
                } 
                if(current != null){
                        newNode.prev        = current.prev;
                        newNode.next        = current;
                        current.prev.next   = newNode;
                        current.prev        = newNode;                               
                }else{

                    this.tail.next = newNode;
                    newNode.prev = this.tail;
                    this.tail = newNode;
                    this.size++;                    
                }
            }
        
    }
    public void printList(){
        
        Node currNode = this.head;
    
        System.out.println("\nDoublyLinkedList: ");
        
      
        System.out.print("null <--->");
        // Traverse through the LinkedList
        while (currNode != null) {
            // Print the data at current node
            System.out.print(" {id:" + currNode.id + "   " + currNode.name + "}  <--->");
            // Go to next node
            currNode = currNode.next;
        }
        System.out.println("  null");
          
    }
    
  
    
}
