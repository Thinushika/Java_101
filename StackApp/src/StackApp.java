class StackX
{
    private int maxSize; // size of stack array
    private long[] stackArray;
    private int top; // top of stack
    //--------------------------------------------------------------
    public StackX(int s) // constructor
    {
        maxSize = s; // set array size
        stackArray = new long[maxSize]; // create array
        top = -1; // no items yet
    }
    //--------------------------------------------------------------
    public void push(long j) // put item on top of stack
    {
        if(top != maxSize-1){
            stackArray[++top] = j; // increment top, insert item
        }else {
            System.out.println("Stack is full");
        }
    }
    //--------------------------------------------------------------
    public long pop() // take item from top of stack
    {
        if(top != -1){
            return stackArray[top--]; // access item, decrement top
        }else {
             System.out.println("Stack is empty");
             return 0;
        }
    }
    //--------------------------------------------------------------
    public long peek() // peek at top of stack
    {
        return stackArray[top];
    }
    //--------------------------------------------------------------
    public boolean isEmpty() // true if stack is empty
    {
        return (top == -1);
    }
    //--------------------------------------------------------------
    public boolean isFull() // true if stack is full
    {
         return (top == maxSize-1);
    }
//--------------------------------------------------------------
} // end class StackX
////////////////////////////////////////////////////////////////
public class StackApp {

    public static void main(String[] args) {
        StackX theStack = new StackX(10); // make new stack
        theStack.push(20); // push items onto stack
        theStack.push(40);
        theStack.push(60);
        theStack.push(80);
        while( !theStack.isEmpty() ) // until it’s empty,
        { // delete item from stack
             long value = theStack.pop();
             System.out.print(value); // display it
             System.out.print(" ");
        } // end while
    }
    
}
