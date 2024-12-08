import java.util.Scanner;

public class Prime_Num_Checker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Kindly input your number: ");
        int num = scanner.nextInt(); 
        
        if (num <= 1) { 
            System.out.println(num + " is not a prime number.");
        } else {
            boolean isPrime = true; 
            
            int i = 2; 
            while (i <= num / 2) { 
                if (num % i == 0) { 
                    isPrime = false;
                    break; 
                }
                i++;
            }
            
            if (isPrime) {
                System.out.println(num + " is a prime number.");
            } else {
                System.out.println(num + " is not a prime number.");
            }
        }
        scanner.close(); 
    }
}