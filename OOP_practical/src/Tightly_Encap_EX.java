class Phone{
    private String call;
    private String Message; 
    public void displayPhone(){
         System.out.println("Can make a call & send message");
    }
}

class Mobile_phone extends Phone{
    private String listn_Audio;
    public void displayMobile_phone(){
         System.out.println("Can listn audio");
    }
}
class Smart_phone extends Phone{
    private String internet_access;
    public void displaySmart_phone(){
         System.out.println("Can access internet");
    }
}
public class Tightly_Encap_EX {

  
    public static void main(String[] args) {
        Phone p = new Phone();
        p.displayPhone();
        Mobile_phone mp = new Mobile_phone();
        mp.displayPhone();
        mp.displayMobile_phone();
        Smart_phone sp = new Smart_phone();
        sp.displayPhone();
        sp.displaySmart_phone();
    }
    
}
