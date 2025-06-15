import java.util.Scanner;
class BinaryToDecimal{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a value:");
		String a=sc.nextLine();
		System.out.println("Binary To Decimalfor "+a+" is:"+Integer.parseInt(a,2));
		
	}
}