public class L20_NonArgConstructor {

    int i;

    private L20_NonArgConstructor(){
        i = 5;
        System.out.println("Constructor is called: ");
    }

    public static void main(String[] args){
        L20_NonArgConstructor Lm = new L20_NonArgConstructor();
        System.out.println("Value of i : " + Lm.i);
    }
}
