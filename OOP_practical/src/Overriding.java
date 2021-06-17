class Dog{
    public void speak () {                
        System.out.println ("Woof...");           
    }
    
}
class cat extends Dog{
     @Override
     public void speak () {                
        System.out.println ("Meow...");           
    }
}
class parrot extends Dog{
     @Override
     public void speak () {                
        System.out.println (".......");           
    }
}
public class Overriding {

  
    public static void main(String[] args) {
       Dog D = new Dog();
       D.speak();
       
       cat C = new cat();
       C.speak();
       
       
    }
    
}
