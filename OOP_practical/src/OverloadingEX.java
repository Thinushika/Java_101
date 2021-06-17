class overloading{
    
    void Tool(int X){
        System.out.println("Tool method with integer value : ");
        System.out.println("int X = "+X);
     }
    void Tool(Double X){
        System.out.println("Tool method with Double value : ");
        System.out.println("Double X = "+X); 
     }
    void Tool(float X){
        System.out.println("Tool method with float value : ");
        System.out.println("float X = "+X); 
     }
    void space(){
        System.out.println(" ");
    }
}
public class OverloadingEX {
     
   
    public static void main(String[] args) {
        overloading OL=new overloading();
        OL.Tool(10);
         OL.space();
        OL.Tool(10.55);
         OL.space();
        OL.Tool(10.5f);
       
    }
    
}
