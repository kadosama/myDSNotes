
package btreeexample;

public class BTreeExample {

    public static void main(String[] args) {
        
        BTree b = new BTree(2);
        b.Insert(8);
        b.Insert(9);
        b.Insert(10);
        b.Show();
        System.out.println("");
        b.Insert(11);
        b.Show();
        System.out.println("");
        
        b.Insert(7);
        b.Show();
        System.out.println("");
        
        b.Insert(20);
        b.Show();
        System.out.println("");
        
        b.Insert(17);
        b.Show();
        System.out.println("");
                
        b.Insert(16);
        b.Show();
        
        b.Insert(21);
        b.Insert(25);
        b.Insert(13);
        b.Insert(15);
        b.Insert(14);
        
    
    }
    
}
