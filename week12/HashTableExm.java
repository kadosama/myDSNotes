
package hashtableexm;


public class HashTableExm {

    public static void main(String[] args) {
        
        myHash hTable = new myHash(10);
        
        for(int i = 0; i < 100; i++)
            hTable.add(i);
        
        
        hTable.printMap();
        hTable.removeItem(0);
        hTable.printMap();
        
        System.out.println(hTable.contains(30));
    }
    
}
