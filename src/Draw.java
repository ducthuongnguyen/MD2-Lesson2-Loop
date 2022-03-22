import java.util.Scanner;

public class Draw {
    public static void main(String[] args) {

        //Print the square triangle
        for (int i = 0; i < 5; i++) {
            System.out.println("");
            for (int j = 5; j > i; j--) {
                System.out.print("*");
            }
        }

        for (int i = 0; i < 5; i++) {
            System.out.println("");
            for (int k = 0; k < i; k++) {
                System.out.print("   ");
            }
            for (int j = 5; j > i; j--) {
                System.out.print(" * ");
            }
        }

        //Print the rectangle
        for (int i = 0; i < 4; i++) {
            System.out.println("");
            for (int j = 0; j < 8; j++) {
                System.out.print(" * ");
            }
        }
        System.out.println("\n-----------------------");

        //Print isosceles triangle
        Scanner input = new Scanner(System.in);
        int height, k = 0;
        System.out.println("Enter the height: ");
        height = input.nextInt();

        for (int i = 1; i <= height; ++i, k = 0) {
            for (int j = 1; j <= height - i; ++j) {
                System.out.print(" ");
            }
            while (k != 2 * i - 1) {
                System.out.print("*");
                ++k;
            }
            System.out.println();
        }
        System.out.println("\n-----------------------");
    }
}
