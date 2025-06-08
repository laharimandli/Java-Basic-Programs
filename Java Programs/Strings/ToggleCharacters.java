import java.util.Scanner;
import java.lang.StringBuffer;
class ToggleCharacters{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any String:");
		String str=sc.nextLine();
		StringBuffer sb=new StringBuffer(str);
		for(int i=0;i<sb.length();i++){
		   char ch=sb.charAt(i);
		   if(Character.isUpperCase(ch)){
		    sb.setCharAt(i,Character.toLowerCase(ch));
		   }
		   else
		     sb.setCharAt(i,Character.toUpperCase(ch));
		}
		System.out.println("The String "+str+" after Toggling is:"+sb);
		}
}