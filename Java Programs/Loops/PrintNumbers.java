import java.util.Scanner;
class PrintNumbers{
	public static void main(String args[]){
		System.out.println("Enter nth number:");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=1;i<=n;i++){
		      System.out.print(i+" ");
		}
	}

}