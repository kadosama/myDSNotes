/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testproject;

/**
 *
 * @author acahit
 */
public class ArrayClass {
    
    private Integer[]   array;
    private Integer     numberItems;
    
    public ArrayClass(Integer maxIndex){
        
        this.array = new Integer[maxIndex];
        this.numberItems = 0;
    }
    public void printArray(){
        for(int i = 0; i < this.numberItems; i++){
            
            System.out.println(this.getElement(i) + "");

        }
    }
    public void setElement(Integer i , Integer e ){
        if(i > this.numberItems){
            System.out.println("Error index is out of bound !!");
            return;
        }
        this.array[i] = e ;
        this.numberItems++;
           
    }    
    public Integer getElement(Integer i ){
        return this.array[i];
    }
    public void deleteItem(Integer index){
        
        for(int i = index; i < this.numberItems; i++){
            this.array[i] = this.array[i + 1];
        }
        this.numberItems--;
        
    }
    public void sort(){
        int temp;
        for(int i = 0; i< this.numberItems; i++){
            for(int j = i + 1 ;j< this.numberItems;j++){
                
                if(this.array[i]>this.array[j]){
                    temp = this.array[i];
                    this.array[i] = this.array[j];
                    this.array[j] = temp;
                }
            }
        }
    }
    public static void  main(String[] args){
        
        ArrayClass my_array = new ArrayClass(10);
        
        MemoryCell Cell1 = new MemoryCell();
        boolean b1 = true;
        Cell1.write(b1);
        System.out.println(Cell1.read());
        
        my_array.setElement(0, 22);
        my_array.setElement(1, 35);
        my_array.setElement(2, 99);
        my_array.setElement(3, 15);
        my_array.sort();
        my_array.printArray();
        
        my_array.deleteItem(0);
        
        System.out.println("-------------");
        my_array.printArray();
        my_array.setElement(3, 3);
        my_array.setElement(4, 7);
        my_array.setElement(5, 8);
        System.out.println("-------------");
        my_array.sort();
        my_array.deleteItem(3);
        my_array.printArray();
        
    }
    
}


