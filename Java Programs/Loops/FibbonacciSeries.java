import java.util.Scanner;
class FibonnacciSeries{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter a anumber:");
		int n=sc.nextInt();
		int a=0,b=1;
		System.out.print(a+" "+b+" ");
		for(int i=2;i<n;i++){
			int res=a+b;
			System.out.print(res+" ");
			int a=b;
			int b=res;
		}
	}
	
	
}