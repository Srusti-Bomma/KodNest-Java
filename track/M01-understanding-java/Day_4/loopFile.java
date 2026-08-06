
public class loopFile {

    public static void main(String[] args) {
        //For loop
        //use it when you know how many times the loop will run
        //condition -->where to stop
        //initialization -->where to start
        //increment/decrement -->how to move to next iteration
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }

        //while loop
        //use it when you don't know how many times the loop will run because the condition is based on some variable that changes 
        int j = 1;
        while (j <= 5) {
            System.out.println(j);
            j++;
        }

        //do-while loop
        //use it when you don't know how many times the loop will run because the condition is based on some variable that changes
        //even if the condition is false, the loop will run once
        int k = 1;
        do {
            System.out.println(k);
            k++;
        } while (k <= 5);

        //Nested for loop
        //use it when you want to print something in rows and columns
        //the outer loop controls the number of rows
        //the inner loop controls the number of columns
        for (int m = 1; m <= 5; m++) {
            for (int n = 1; n <= m; n++) {
                System.out.print(n + "");
            }
            System.out.println();
        }

        //Enhanced for loop
        //use it when you want to iterate through an array or collection
        //Syntax : for(dataType variable : arrayName) {
        //    System.out.println(variable);
        //}
        int[] arr = {1, 2, 3, 4, 5};
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
