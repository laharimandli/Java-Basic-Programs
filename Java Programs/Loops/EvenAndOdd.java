import java.util.Scanner;
class EvenAndOdd{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter nth Value:");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++){
			if(i%2==0)System.out.println(i+" is Even!");
			else System.out.println(i+" is Odd!");
		}
	}
}