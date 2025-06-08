import java.util.Scanner;
class CheckPalindrome{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int n=sc.nextInt();
		int k=n;
		int res=0;
		while(n>0){
			int rem=n%10;
			res=res*10+rem;
			n=n/10;
		}
		if(res==k)System.out.println(k+" is a Palindrome");
		else System.out.println(k+" is not a Palindrome");
	}
}