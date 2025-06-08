import java.util.Scanner;
class ProductOfDigit{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int s=1;
		while(n>0){
			int r=n%10;
			s*=r;
			n/=10;
		}
		System.out.println("Product of Digits:"+s);
	}
}