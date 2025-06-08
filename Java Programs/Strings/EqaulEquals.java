import java.util.Scanner;
class EqaulEquals{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 2 String:");
		String str1=sc.nextLine();
		String str2=sc.nextLine(;
		if(str1==str2)
		 System.out.println("Str1 and Str2 has same references");
		 else
		 System.out.println("Str1 and Str2 has no same references");
		if(str1.equals(str2))
		 System.out.println("Str1 and Str2 has same Content");
		 else
		 System.out.println("Str1 and Str2 has no same Content");
		
		}
}