import java.util.Scanner;
class StringPalindrome{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String:");
		String str=sc.nextLine();
		String original=str.toLowerCase();
	    StringBuilder sb=new StringBuilder(str);
		String reversed=sb.reverse().toString();
		if(original.equals(reversed)){
			System.out.println(str+" is a Palindrome");
		}
		else
			System.out.println(str+" is not a Palindrome");
		}
}