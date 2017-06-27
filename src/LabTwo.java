import java.util.Scanner;

/**
 * Created by kuwu on 2017/06/26.
 */
public class LabTwo {
    Scanner scnr = new Scanner(System.in); // create a scanner object


    public void getNum() {
        System.out.println("Please enter a number 1 and 100");
        int x = scnr.nextInt();

        if ( x > 0 && x < 101) {


            if (x > 2 && x < 25 && (x % 2) == 0) {
                System.out.print(x + " is even and less than 25");
            }
            if (x > 25 && x < 61 && (x % 2) == 0) {
                System.out.print(x + " is even and between 26 and 60");
            }
            if (x > 60 && x <= 100 && (x % 2) == 0) {
                System.out.print(x + " is even and over 60");
            }
            if (x > 60 && x <= 100 && (x % 2) != 0) {
                System.out.print(x + " is odd and over 60");
            } else if (x > 0 && x < 60 && (x % 2) != 0) {
                System.out.print(x + " is odd");
            }
        }

        else {
            System.out.print("You have a number out of the range");
        }
    }

    public static void main (String [ ] args){

        LabTwo check = new LabTwo();
        check.getNum();

    }

}
