import java.util.Stack;

public class SpecialStack implements NormalStack<Integer> {
    
    private Stack<Integer> stack;
    private Stack<Integer> minStack;

    public SpecialStack(){
        stack = new Stack<Integer>();
        minStack = new Stack<Integer>();
    }
    
    public Integer pop() {
        minStack.pop();
        return stack.pop();
    }
    public Integer peek(){
        return stack.peek();
    }
    public void push(Integer n){
        stack.push(n);

        if(minStack.isEmpty()){
            minStack.push(n);
        }else if(n<minStack.peek()){
            minStack.push(n);
        }else{
            minStack.push(minStack.peek());
        }
    }
    public boolean isEmpty(){
        return stack.empty();
    }

    public Integer getMin(){
        return minStack.peek();
    }
}
