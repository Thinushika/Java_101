public class L19_Constructors {

    private String name;

    // Constructor
    L19_Constructors(){
        System.out.println("Constructor Called: ");
        name = "Programiz";
    }

    public static void main(String[] args){

        // create obj of L19_Constructors class
        L19_Constructors m = new L19_Constructors();
        System.out.println("The name is "+ m.name);
    }
}
