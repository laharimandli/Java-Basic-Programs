import java.util.Scanner;
class PrintPrimeNumbers{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n Value:");
		int n=sc.nextInt();
		int c=0;
        for(int i=1;i<n;i++){
			if(n%i==0)
				c++;
		}
		if(c==1)System.out.println(n+" is Prime Number..");
		else System.out.println(n+" is not Prime Number..");
	}
}