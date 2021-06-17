class login{
    private String Username;
    private String Password;
    private String E_mail_address;
    
  public login(String Username,String Password, String E_mail_address){
        Username =Username;
        Password = Password;
        E_mail_address = E_mail_address;
        this.Username="admin";
        this.Password="admin123";
        this.E_mail_address="abc123@gmail.com";
    } 
   public String getUsername(){
        return Username;
    }
    public String getPassword(){
        return Password;
    }
    public String getE_mail_address(){
        return E_mail_address;
    }
    void displayinfo(){
        System.out.println("Username : "+Username);
        System.out.println("Password : "+Password);
        System.out.println("E_mail_address : "+E_mail_address);
    }
}
public class Tightly_Encap_class {

    public static void main(String[] args) {
        login acc1 = new login("","","");
        acc1.getUsername();
        acc1.getPassword();
        acc1.getE_mail_address();
        acc1.displayinfo();
    }
    
}
