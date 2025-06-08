import java.util.Scanner;
class ReplaceSpaces{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String:");
		String str=sc.nextLine();
		StringBuilder sb=new StringBuilder(str);
		for(int i=0;i<sb.length();i++)
		{
		if(sb.charAt(i)== ' '){
		    sb.setCharAt(i,'-');
		}
		}
		System.out.println(sb.toString());
		
		}
}