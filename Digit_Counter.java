import java.util.Scanner;
public class Digit_Counter {

	public static void main(String[] args) {
		Scanner scanner  = new Scanner(System.in);
		System.out.println("Kindly input the number you want: ");
		int num = scanner.nextInt();
		int count = 0;
		while (num != 0) {
			num = num / 10;
			count ++;
		}
		System.out.println("The number of digits is: " + count);

	}

}
