
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
    
    public int leafNumber(Node root){
        
        if(root == null)
            return 0;
        else
            if(root.getLeft() == null && root.getRight() == null)
                return 1;
        return leafNumber(root.getLeft()) + leafNumber(root.getRight());
    }
    
    public int findDepth(Node root){
          
        if (root == null)
            return -1;
        else {        
            int lDepth = findDepth(root.getLeft());
            int rDepth = findDepth(root.getRight());
 
            if (lDepth > rDepth)
                return (lDepth + 1);
            else
                return (rDepth + 1);
        }
    }
    public Node deleteNode(Node root, int key){
        
        //If tree is empty...
        if(root == null)
            return null;
        
        //Otherwise go left or right subtree...
        if(key < root.getData())
            root.setLeft(deleteNode(root.getLeft(),key));
        else if(key > root.getData())
            root.setRight(deleteNode(root.getRight(),key));
        
        //if key is same as root's key then This is the node to be deleted...
            else{
                //if with only one child or no child...
                if(root.getLeft() == null)
                    return root.getRight();
                else if(root.getRight() == null)
                    return root.getLeft();
                
                //node with two childeren:Get the inorder succesor(smallest in the right subtree)
                root.setData(minValue(root.getRight()));
                root.setRight(deleteNode(root.getRight(),root.getData()));
            }
            return root;
    }
    public int minValue(Node root){
        int min = root.getData();
        
        while(root.getLeft() != null){
            min     = root.getLeft().getData();
            root    = root.getLeft();
        }
        return min;
    }
        
        
    

}
