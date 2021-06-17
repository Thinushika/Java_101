
public class Data_HidingEX {
String name;
int ID;
     void setSt_name(String Name){
        this.name = Name;
    }
    void setSt_ID(int id){
        this.ID = id;
    } 
    void Display(){
         System.out.println("Student Name : "+name);
         System.out.println("Student ID No : "+ID);
           
     }
      
    public static void main(String[] args) {
       Data_HidingEX D = new Data_HidingEX();
       D.setSt_ID(001);
       D.setSt_name("Sumudu");
    }
    
}
