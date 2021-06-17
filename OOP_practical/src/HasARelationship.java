class Motor 
{
    String MotorNo;
    String MotorType;
    
    public Motor(String MotorNo,String MotorType){
        this.MotorNo = MotorNo;
        this.MotorType=MotorType;
    }    
    public void work()
    {        
        System.out.println("Motor of Fan has been started ");       
    }    
}
class Fan 
{   
    private  Motor motor; 
    private  String FanType;
   public Fan(String FanType,Motor motor)
    {
        this.motor = motor;
        this.FanType=FanType;
    }
    public void Working() 
    { 
        {
            motor.work();
            System.out.println("Fan is working");
        }
    }
    public void displayFanInfor() 
    {         
            System.out.println("Type of fan : "+FanType);
            System.out.println("Motor No : "+motor.MotorNo);
            System.out.println("Type of fan motor : "+motor.MotorType);  
    }    
}
public class HasARelationship {
    public static void main(String[] args) {
        Motor M1 = new Motor("2456J","sony234.1");
         
        Fan F = new Fan("Sony",M1);
        F.Working();
        F.displayFanInfor();
    }
    
}
