import java.util.Scanner;

class prime{

	public static boolean prime1(int n){
		int i, flag=0;
		for(i=2;i  < n/2;i++){
			if(n%i == 0)
			{
				return false;
			}
	}
	return true;
}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n;
		System.out.println("Enter your number:");
		n = input.nextInt();
		prime1(n);
		if(prime1(n))
		{
			System.out.println(n+" is a prime number");
		}else
			System.out.println(n+" is not a prime number");
}
}