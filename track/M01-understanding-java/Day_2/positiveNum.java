
public class positiveNum {

    public static void main(String[] args) {
        int num = 5;
        if (num > 0) {
            System.out.println("Positive");
        } else if (num < 0) {
            System.out.println("Negative");
        } else {
            System.out.println("Number is zero.");
        }

        if (num % 2 == 0) {
            System.out.println("Parity: Even");
        } else {
            System.out.println("Parity: Odd");
        }

        int firstScore = 18;
        int secondScore = 25;
        if (firstScore >= secondScore) {
            System.out.println("Larger score: " + firstScore);
        } else {
            System.out.println("Larger score: " + secondScore);
        }

    }
}
