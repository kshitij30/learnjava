import java.util.Scanner;

class trianglepattern2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int i,j,n;
		System.out.println("Enter the number of rows to print pattern: ");
		n = input.nextInt();
		for (i=1;i<=n;i++) {
			for(j=(n-i); j>0; j--) 
            { 
                System.out.print(" "); 
            } 
			for (j=0;j<i;j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}