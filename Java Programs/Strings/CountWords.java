import java.util.Scanner;
class CountWords{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String:");
		String str=sc.nextLine();
		String a[]=str.split(" ");
		int w=0;
		for(String s:a){
		w++;
		System.out.println(s);
		}
		System.out.println("Count Words:"+w);
		
		}
}