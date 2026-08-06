
public class JumpControlConstruct {

    public static void main(String[] args) {
        //break
        //use it to exit the loop
        //here after all the numbers get skipped because break is encountered
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                System.out.println("3 is encountered. so break is executed");
                break;
            }
            System.out.println(i);
        }

        //continue
        //use it to skip the current iteration
        //here only number 3 gets skipped
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                System.out.println("3 is encountered. so continue is executed. so 3 is skipped");
                continue;
            }
            System.out.println(i);
        }

        //return
        //use it to exit the method
        //here the control goes to the main method
        //here after the 2 only two numbers get printed because return is encountered
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                System.out.println("3 is encountered. so return is executed");
                return;
            }
            System.out.println(i);
        }
    }
}
