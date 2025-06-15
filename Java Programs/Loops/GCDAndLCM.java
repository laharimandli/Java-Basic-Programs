import java.util.Scanner;
class GCDAndLCM{
    static int lcm(int a,int b){
	    return (a*b)/gcd(a,b);
	}
    static int gcd(int a,int b){
		while(b!=0){
			int t=b;
			b=a%b;
			a=t;
		}
		return a;
	}
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two value:");
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println("LCM of"+a+"and"+b+" is":"+lcm(a,b));
		
	}
}