import java.util.Scanner;
class palindrome {
	public static boolean palindrome1(int n) {
		int a=0,temp=0,i,r=0;
		temp = n;
		while(n>0) {
			r = n%10;
			a = (a*10)+r;
			n = n/10;
		} 
		if (temp == a) {
			return true;
		}
		return false;
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n;
		System.out.println("Enter the number you want to check for Palindrome:");
		n = input.nextInt();
		palindrome1(n);
		if (palindrome1(n)) {
			System.out.println(n+" is a palindrome.");
		} else
			System.out.println(n+" is not a palindrome.");
	}
}