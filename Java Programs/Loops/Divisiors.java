import java.util.Scanner;
class Divisiors{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a value:");
		int a=sc.nextInt();
	    System.out.print("Divisiors of "+a+"is:");
		for(int i=1;i<=a;i++){
		   if(a%i==0)
			   System.out.print(i+" ");
		}
		
	}
}