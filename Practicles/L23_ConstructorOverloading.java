public class L23_ConstructorOverloading {

    String language;

    L23_ConstructorOverloading(){
        this.language = "Java";
    }

    L23_ConstructorOverloading(String language){
        this.language = language;
    }

    public void getName(){
        System.out.println("Programming language: "+ this.language);
    }

    public static void main(String[] args){
        L23_ConstructorOverloading Lc = new L23_ConstructorOverloading();
        L23_ConstructorOverloading Lc2 = new L23_ConstructorOverloading("Python");

        Lc.getName();
        Lc2.getName();
    }
}
