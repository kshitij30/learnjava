import java.util.Scanner;

class trianglepattern3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int i,j,n;
		System.out.println("Enter the number of rows to print pattern: ");
		n = input.nextInt();
		for (i=0;i<=n;i++) {
			for (j=0;j<n-i;j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}