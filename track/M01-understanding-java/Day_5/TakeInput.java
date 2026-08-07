
import java.util.Scanner;

public class TakeInput {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //IMPORTANT : for input of word ==> next()
        //for input of sentence/line ==> nextLine()
        System.out.println("Enter the byte value :");
        byte a = sc.nextByte();
        System.out.println("The byte value is :" + a);

        System.out.println("Enteer the int value :");
        int b = sc.nextInt();
        System.out.println("The int value is :" + b);

        System.out.println("Enter the long value :");
        long c = sc.nextLong();
        System.out.println("The long value is :" + c);

        System.out.println("Enter the float value :");
        float d = sc.nextFloat();
        System.out.println("The float value is :" + d);

        System.out.println("Enter the double value :");
        double e = sc.nextDouble();
        System.out.println("The double value is :" + e);

        //System.out.println("Enter the char value :");
        // String f = sc.next();
        // char f = f.charAt(0);
        // System.out.println("The char value is :" + f);
        System.out.println("Enter the boolean value :");
        boolean g = sc.nextBoolean();
        System.out.println("The boolean value is :" + g);

        System.out.println("Enter the String value :");
        String h = sc.next();
        System.out.println("The String value is :" + h);

        System.out.println("Enter the short value :");
        short i = sc.nextShort();
        System.out.println("The short value is :" + i);

    }
}
