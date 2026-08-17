
import java.util.Scanner;

public class reversePrint {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a[] = new int[5];
        System.out.println("Enter the array elements: ");
        for (int i = 0; i <= a.length - 1; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("The reverse print of the array is :");
        for (int i = a.length - 1; i >= 0; i--) {
            System.out.println(a[i]);
        }
    }
}
