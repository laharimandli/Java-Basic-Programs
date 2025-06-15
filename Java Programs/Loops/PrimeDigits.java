import java.util.Scanner;
class PrimeDigits{
	public static boolean isPrime(int i){
		if(i<=1) return false;
		for(int j=2;j<i;j++){
			if(i%j==0)
				return false;
		}
		return true;
	}
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n Value:");
		int n=sc.nextInt();
		int rem=0;
		while(n>0){
			rem=n%10;
			if(isPrime(rem)){
				System.out.print(rem+" ");
			}
			n/=10;
		}

		
	}
}