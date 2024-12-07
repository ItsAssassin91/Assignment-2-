import java.util.Scanner;

public class Find_GCD {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();
        
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();
        
        int originalNum1 = num1;
        int originalNum2 = num2;
        
        while (num2 != 0) {
            int temp = num2;
            num2 = num1 % num2;
            num1 = temp;
        }
        
        System.out.println("The GCD of " + originalNum1 + " and " + originalNum2 + " is " + num1);
        
        scanner.close();
    }
}