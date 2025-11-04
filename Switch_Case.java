package J12;
import java.util.Scanner;


public class Switch_Case {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice;

		do {
			System.out.println("\n**");
			System.out.println("1) Reverse Number");
			System.out.println("2) Palindrome Number");
			System.out.println("3) Armstrong Number");
			System.out.println("4) Prime Number");
			System.out.println("5) Even or Odd Number");
			System.out.println("0) Exit");
			System.out.println("");
			System.out.print("\nEnter your choice: ");
			choice = sc.nextInt();

			switch (choice) {
				case 1:
					System.out.print("\nEnter a number: ");
					int num1 = sc.nextInt();
					System.out.println("Your number = " + num1);
					System.out.println("Reversed number = " + reverse(num1));
					break;
				case 2:
					System.out.print("\nEnter a number: ");
					int num2 = sc.nextInt();
					if (isPalindrome(num2)) {
						System.out.println("Number is palindrome.");
					} else {
						System.out.println("Number is not palindrome.");
					}
					break;
				case 3:
					System.out.print("\nEnter a number: ");
					int num3 = sc.nextInt();
					if (isArmstrong(num3)) {
						System.out.println("Number is an Armstrong number.");
					} else {
						System.out.println("Number is not an Armstrong number.");
					}
					break;
				case 4:
					System.out.print("\nEnter a number: ");
					int num4 = sc.nextInt();
					if (isPrime(num4)) {
						System.out.println("Number is prime.");
					} else {
						System.out.println("Number is not prime.");
					}
					break;
				case 5:
					System.out.print("\nEnter a number: ");
					int num5 = sc.nextInt();
					if (isEven(num5)) {
						System.out.println("Number is even.");
					} else {
						System.out.println("Number is odd.");
					}
					break;
				case 0:
					System.out.println("Exiting...");
					sc.close();
					System.exit(0);
				default:
					System.out.println("Enter a valid choice.");
			}
		} while (true);
	}
	public static int reverse(int num) {
		int rev = 0;
		while (num != 0) {
			int rem = num % 10;
			rev = rev * 10 + rem;
			num /= 10;
		}
		return rev;
	}

	public static boolean isPalindrome(int num) {
		return num == reverse(num);
	}

	public static boolean isArmstrong(int num) {
		int sum = 0, temp = num;
		while (temp != 0) {
			int rem = temp % 10;
			sum += rem * rem * rem;
			temp /= 10;
		}
		return sum == num;
	}

	public static boolean isPrime(int num) {
		if (num <= 1)
			return false;
		for (int i = 2; i <= Math.sqrt(num); i++) {
			if (num % i == 0)
				return false;
		}
		return true;
	}

	public static boolean isEven(int num) {
		return (num%2==0);
	}
}

	


