import java.util.Scanner;

public class PrintFirstPrime {
    public static void main(String[] args) {
        int numbers;
        Scanner input = new Scanner(System.in);
        System.out.println("How many prime do you want to show:");
        numbers = input.nextInt();
        int count = 0;
        for (int i = 2; count < numbers; i++) {
            boolean check = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    check = false;
                    break;
                }
            }
            if (check) {
                System.out.print(i + " ");
                count++;
            }
        }
    }
}
