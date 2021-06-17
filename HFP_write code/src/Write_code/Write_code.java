package Write_code;


class WhileLoop{ // while loo how work
     void Loop1(){
         int x = 1; // x is assign to 1
         System.out.println("Before the loop");
         //Start of loop
         while (x<4){ // loop will run while x is 
             System.out.println("In the loop");
             System.out.println("Value of x is " + x);
             x = x +1;
         }// End of loop
         System.out.println("This is after the loop");
     }
 }




class IfElseConditionTest1{ // if condition how work
    void Loop2(){
        int x=3;
        if (x==3){
            System.out.println("x must be 3");
        }
        System.out.println("This runs no matter what");
    }
}



class IfElseConditionTest2{ // if else condition how work
    void Loop2(){
        int x=2;
        if (x==3){
            System.out.println("x must be 3");
        }
        else {
            System.out.println("x is not 3");
        }
        System.out.println("This runs no matter what");
    }
}




public class Write_code {
     public static void main(String[] args) {
         WhileLoop d = new WhileLoop();
         d.Loop1();
         
         IfElseConditionTest1 w = new IfElseConditionTest1();
         w.Loop2();
         
         IfElseConditionTest2 t = new IfElseConditionTest2();
         t.Loop2();
    }
}
