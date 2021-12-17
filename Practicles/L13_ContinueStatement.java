public class L13_ContinueStatement {
    public static void main(String[] args) {
        first:
        for(int i = 1; i <= 10; ++i){
            if(i >= 4 && i <= 9){
                continue first;
            }
            System.out.println(i);
        }
    }
}
