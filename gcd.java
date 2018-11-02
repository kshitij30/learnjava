import java.util.Scanner;

class gcd {
	public static int gcd1(int m,int n){
		int a=0,temp=0,i,r=0;
		if (m ==0 ){
			return n;
		} else if (n == 0){
			return m;
		}
		while(true){
			r= m%n;
			if(r==0){
				return n;
			}
			m=n;
			n=r;
		}
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a,b;
		System.out.println("Enter the numbersto calculate GCD");
		a = input.nextInt();
		b = input.nextInt();
		System.out.println("The GCD of "+a+" and "+b+" is "+gcd1(a,b));
	}
}