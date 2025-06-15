import java.util.Scanner;
class HarmonicSumSeries{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n Value:");
		int n=sc.nextInt();
		double s=0.0;
		for(int i=1;i<=n;i++){
			s=s+(1.0/i);
			System.out.print("1"+"/"+i+" ");
			if(i!=n){
				System.out.print('+');
			}
		}
		System.out.println("\nSum of Harmonic Series:"+s);
	}
}