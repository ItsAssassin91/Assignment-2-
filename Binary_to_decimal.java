import java.util.Scanner;
public class Binary_to_decimal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a binary number: ");
		int bin = sc.nextInt();
		
		int dec = 0;
		int base = 1;
		
		while (bin > 0) {
			int last_digit = bin % 10;
			dec += last_digit * base;
			bin /= 10;
			base *= 2;
		}
		System.out.println("Your decimal number is " + dec);
	}

}
