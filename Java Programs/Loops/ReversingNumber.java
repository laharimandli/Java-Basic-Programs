import java.util.Scanner;
class ReversingNumber{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a value:");
		int n=sc.nextInt();
		int res=0;
		while(n!=0)
		{
			int r=n%10;
			res=res*10+r;
			n=n/10;
		}
		System.out.println(res);
	}
}