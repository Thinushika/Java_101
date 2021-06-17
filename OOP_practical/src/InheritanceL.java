class Method_A{
    public void M1(){
        System.out.println("one");
    }   
}
class Method_B extends Method_A{
    public void M2(){
        System.out.println("four");
    } 
}
class Method_C extends Method_A{
    public void M3(){
        System.out.println("five");       
    }  
}
public class InheritanceL {
    public static void main(String[] args) {
        Method_A A = new Method_A();
        A.M1();
       Method_B B = new Method_B();
        B.M1();
        B.M2();
       Method_C C = new Method_C();
        C.M1();
        C.M3(); 
    }    
}
