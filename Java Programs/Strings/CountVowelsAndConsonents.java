import java.util.Scanner;
class CountVowelsAndConsonents{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any String:");
		String str=sc.nextLine();
		str.toLowerCase();
		int v=0,c=0;
	    for(int i=0;i<str.length();i++){
		     char ch=str.charAt(i);
			 if(ch>='a' && ch<='z'){
			     if(ch=='a'||ch=='i'||ch=='o'||ch=='u'||ch=='e')v++;
				 else c++;
				 
			 }
		 
		}
		System.out.println("Count of Vowels:"+v+" Consonents:"+c);
		
	}
 
}