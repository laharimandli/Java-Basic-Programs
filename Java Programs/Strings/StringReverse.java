import java.util.Scanner;
import java.lang.StringBuffer;
class StringReverse{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any String:");
		String str=sc.nextLine();
		StringBuffer sb=new StringBuffer(str);
		sb.reverse();
		System.out.println(str+" After Reverse is:"+sb);
	}
 
}