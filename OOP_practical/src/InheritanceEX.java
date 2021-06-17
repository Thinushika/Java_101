class Computers{
    public void M1(){
        System.out.println("Have Display");
        System.out.println("Have Keyboard ");
        System.out.println("Have internet access "); 
    }
    void space(){
        System.out.println(" ");
    }
}

class Dextop_Computer extends Computers{
    public void M2(){
        System.out.println("Have Mouse");
    }
    
   
}
class Laptop_Comuter extends Computers{
    public void M3(){
        System.out.println("Can Bring anywhere");
        System.out.println("Have Touch pad/Sereen");
    }   
}
public class InheritanceEX {    
    public static void main(String[] args) {
        Computers C = new Computers();
        C.M1();
        C.space();
        Dextop_Computer DC = new Dextop_Computer();
        DC.M1();
        DC.M2();
        DC.space();
        Laptop_Comuter LC = new Laptop_Comuter();
        LC.M1();
        LC.M3();
    }
    
}
