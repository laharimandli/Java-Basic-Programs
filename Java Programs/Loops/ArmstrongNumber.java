import java.util.Scanner;
class ArmstrongNumber{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a value:");
		int n=sc.nextInt();
		int k=n;
		int s=0;
		while(n>0){
			int r=n%10;
			s+=r*r*r;
			n=n/10;
		}
		if(k==s){
			System.out.println(k+" Armstrong number!");
		}
		else
			System.out.println(k+" Not Armstrong number!");
		
	}
}