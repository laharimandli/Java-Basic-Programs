import java.util.Scanner;
class RemoveExtraSpaces{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String:");
		String str=sc.nextLine();
		System.out.println(str.trim().replaceAll(" ",""));
	}
}