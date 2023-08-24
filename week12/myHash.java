package hashtableexm;

public class myHash {
    
    
    private final Value[] keys;

    public myHash(int tableSize) {
        
        this.keys = new Value[2 * tableSize];
        
        for(int i = 0; i < 2 * tableSize; i++)
            this.keys[i] = new Value();
 
    }
    
    public void add(int newValue){
        
        int indx = hash(newValue);
        this.keys[indx].getList().add(newValue);
            
    }
    public int hash(int newValue){
        
        if(newValue < 50)
            return newValue % 10;  
        else 
            return newValue % 10 + 10;
        
    }
    public void removeItem(int Item){
        
        int indx = this.hash(Item);
        this.keys[indx].getList().remove(Item);
        
    }
    public boolean contains(int Item){
        
        int indx = this.hash(Item);
        return this.keys[indx].getList().contains(Item);
        
    }

    public void printMap(){
        for(int i = 0; i< this.keys.length; i++){
            System.out.print("[" + i +"]" + "--->");
            this.keys[i].printList();
            System.out.println("");
        }
    }
}
