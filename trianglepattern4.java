import java.util.Scanner;

class trianglepattern4 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int i,j,n;
		System.out.println("Enter the number of rows to print pattern: ");
		n = input.nextInt();
		for (i=0;i<n;i++) {
			for (j=0;j<n;j++){
				if (i > j) {
					System.out.print(" ");
				} else
				System.out.print("*");
			}
			System.out.println();
		}
	}
}