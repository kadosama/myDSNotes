
package binarytreeexample;

public class BTree {
    private Node root;
    
    public BTree(){
        root = null;
    }
    public void insertIteratively(int newData){   
        
        Node current = this.getRoot();
        if(root == null){
            this.setRoot(new Node(newData));
        }
        else{
            
            while(true){
                if(current.getData() > newData){
                    if(current.getLeft() == null){
                        current.setLeft(new Node(newData));
                        break;
                    }
                    current = current.getLeft();
                }else{
                    if(current.getRight() == null){
                        current.setRight(new Node(newData));
                        break;
                    }
                    current = current.getRight();
                }
            }     
        }
    
    }
    public Node insertRecursively(int newData, Node root){   
        if(root == null){
            root = new Node(newData);
            return root;
        }    
        if(root.getData() > newData)   
            root.setLeft(insertRecursively(newData, root.getLeft()));
        else
            root.setRight(insertRecursively(newData, root.getRight()));        
        return root;
    }
    
    public void printPreOrder(Node current){
        
        if(current == null)
            return;    
        
        System.out.print(current.getData() + " ");
        printPreOrder(current.getLeft());
        printPreOrder(current.getRight());
    }
    public void printInOrder(Node current){
        
        if(current == null)
            return;    
        
        printInOrder(current.getLeft());
        System.out.print(current.getData() + " ");
        printInOrder(current.getRight());
        
    }
    public void printPostOrder(Node current){
        
        if(current == null)
            return;    
        
        printPostOrder(current.getLeft());
        printPostOrder(current.getRight());
        System.out.print(current.getData() + " ");
        
    }  
    public Node getRoot(){ return root;}
    public void setRoot(Node r){ this.root = r;}

}
