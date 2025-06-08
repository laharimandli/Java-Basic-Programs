import java.util.Scanner;
public class N_Natural_Numbers{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter nth Value:");
		int n=sc.nextInt();
		int sum=0;
		for(int i=1;i<=n;i++){
			sum+=i;//sum=sum+i
		}
		System.out.println("Sum of "+n+" values is:"+sum);
	}
}