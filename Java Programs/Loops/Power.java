import java.util.Scanner;
class Power{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Base value:");
		int b=sc.nextInt();
		System.out.println("Enter Exponential value:");
		int e=sc.nextInt();
		if(e<0)e=-e;
		int res=1;
		for(int i=1;i<=e;i++)
			res*=b;
		System.out.println(b+"^"+e+":"+res);
	}
}