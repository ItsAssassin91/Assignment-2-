import java.util.Scanner;

public class Sum_Of_Even_Numbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kindly input the number you wish to use! ");
        int num = scanner.nextInt();
        int total = 0;
        while (num != 0) {
            if (num % 2 == 0) {
                total += num; 
            }
            num = num - 1; 
        }
        System.out.println("The sum is: " + total);
    }
}