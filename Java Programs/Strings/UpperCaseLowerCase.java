import java.util.Scanner;
class UpperCaseLowerCase{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any String:");
		String str=sc.nextLine();
		if(str.equals(str.toUpperCase()))
			System.out.println(str.toLowerCase());
		else
			System.out.println(str.toUpperCase());
			
		}
}