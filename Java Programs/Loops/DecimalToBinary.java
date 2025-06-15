import java.util.Scanner;
class DecimalToBinary{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a value:");
		int a=sc.nextInt();
		int n=a;
		String binary="";
		while(a!=0){
		    int rem=a%2;
			binary=rem+binary;
			a/=2;
		}
		System.out.println("Decimal To Binary for "+n+" is:"+binary);
		
	}
}