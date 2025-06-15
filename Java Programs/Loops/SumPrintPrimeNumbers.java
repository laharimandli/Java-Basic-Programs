import java.util.Scanner;
class SumPrintPrimeNumbers{
	public static boolean isPrime(int i){
		if(i<=1) return false;
		for(int j=2;j<i;j++){
			if(i%j==0)
				return false;
		}
		return  true;
		
	}
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n Value:");
		int n=sc.nextInt();
		int s=0;
		for(int i=1;i<=n;i++){
			if(isPrime(i)){
				s+=i;
				System.out.print(i+" ");
			}
		}
			System.out.println("\nSum of Prime Numbers:"+s);

		
	}
}