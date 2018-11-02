import java.util.Scanner;

class fibonacci{

	public static void fibonacci1(int n){
		int a=0,b=1,temp=0,i;
		String fib;
		for(i=0;i<=n;i++){
			a=b;
			b=temp;
			temp=a+b;
			System.out.print(temp+" ");
	}
}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n,a=0,b=1;
		System.out.println("Enter the number of digits in the series:");
		n = input.nextInt();
		System.out.print(a+" ");
		fibonacci1(n-2);
}
}