
package mystack;

public class stack <T> {
    
    public Object[] array;
    public int      top;
    
public stack(int size){
    
    this.array  = new Object[size];
    this.top    = -1;
}
public boolean isFull(){
    
    return this.top == (this.array.length - 1);
}
public boolean isEmpty(){
    
    return this.top == -1;
}
public void push(T value){
    if(this.isFull()){
        System.out.println("Stack is overflow");
    }else{
        this.top++;
        this.array[this.top] = value;
    }
}
public T pop(){
    
    if(isEmpty()){
        System.out.println("Stack is Empty");
        return null;
    }
    System.out.println("----------After Pop--------");
    return (T)this.array[this.top--];   
}
public void print(){
    
    for(int i = this.top ; i >= 0 ; i--){
        if(i == this.top)
            System.out.println("[" + this.array[i] + "]" + "<---Top");
        else
           System.out.println("[" + this.array[i] + "]"); 
    }
}         
}
