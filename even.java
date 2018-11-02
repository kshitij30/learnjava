import java.util.Scanner;

class even{

	public static int even1(int n){
		return n/2;
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n;
		System.out.println("Enter your number:");
		n = input.nextInt();
		even1(n);
			if (n%2 == 0) {
			System.out.println("Entered Number is even");
		}
		 else
		System.out.println("Entered Number is odd");
		}
}