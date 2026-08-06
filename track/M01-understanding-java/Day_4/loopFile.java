
public class loopFile {

    public static void main(String[] args) {
        //For loop
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }

        //while loop
        int j = 1;
        while (j <= 5) {
            System.out.println(j);
            j++;
        }

        //do-while loop
        int k = 1;
        do {
            System.out.println(k);
            k++;
        } while (k <= 5);

        //Nested for loop
        for (int m = 1; m <= 5; m++) {
            for (int n = 1; n <= m; n++) {
                System.out.print(n + "");
            }
            System.out.println();
        }

        //Enhanced for loop
        int[] arr = {1, 2, 3, 4, 5};
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
