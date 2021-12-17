import java.util.Scanner;

class Student{
    private String stdID;
    private String stdName;
    private int stdAge;
    private String stdEmail;

    public void getUserDetails(){
        Scanner input = new Scanner(System.in);
        System.out.println("Admission filling form");

        System.out.println("Enter your ID : ");
        stdID = input.next();

        System.out.println("Enter your Name : ");
        stdName = input.next();

        System.out.println("Enter your Email : ");
        stdEmail = input.next();

        System.out.println("Enter your Age : ");
        stdAge = input.nextInt();

        System.out.println("\n-------------- Congratulations! You are enrolled -----------\n");
        System.out.println("\t1)   Student ID : " + stdID +
        "\n\t2)   Student Name : " + stdName +
        "\n\t3)   Student Age : " + stdAge +
        "\n\t4)   Student Email : " + stdEmail +"\n" );

        input.close();
    }

}

public class L17_ClassesObject {
    public static void main(String[] args) {
        Student st = new Student();
        st.getUserDetails();
    }
}
