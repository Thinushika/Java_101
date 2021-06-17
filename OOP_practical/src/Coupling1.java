interface Topic{
    void understand();
}
class Topic1 implements Topic{
    public void understand()
    {
       System.out.println("Got it ");
    }
            
}
class Topic2 implements Topic{
    public void understand()
    {
       System.out.println("understand ");
    }
            
}
public class Coupling1 {
    public static void main(String[] args) {
     Topic t = new Topic1();
     t.understand();
     
     Topic h = new Topic2();
     h.understand();
    }
    
}
