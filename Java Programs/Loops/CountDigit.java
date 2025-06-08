import java.util.Scanner;
class CountDigit{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a value:");
		int n=sc.nextInt();
		int c=0;
		while(n>0){
			if(n==0)
				c++;
			else{
			int rem=n%10;
			c++;
			n/=10;
			}
			
		}
		System.out.println("Count of Digits:"+c);
	}
}