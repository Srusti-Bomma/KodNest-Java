
import java.util.Scanner;

public class nxtLine {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age :");
        int age = sc.nextInt();
        System.out.println("The age is :" + age);

        //nextInt() and nextLine() together
        //when nextInt() is used, the newline character is not consumed
        //so when nextLine() is used, it consumes the newline character
        //to avoid this, we can use nextLine() after nextInt()
        //sc.nextLine();
        System.out.println("Enter your name :");
        String name = sc.nextLine();
        System.out.println("The name is :" + name);

        System.out.println("Enter your fullname :");
        String fullName = sc.nextLine();
        System.out.println("The fullname is :" + fullName);
    }
}
