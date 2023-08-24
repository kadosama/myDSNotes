
package mystack;

public class MyStack {

    public static void main(String[] args) {
        
        stack<Character> my_stack = new stack(8);
        
        
        my_stack.push('A');
        my_stack.push('B');
        my_stack.push('C');
        
        my_stack.print();
        
        my_stack.pop();
        my_stack.print();
        my_stack.push('E');
        my_stack.print();
        
        

                
    }
    
}
