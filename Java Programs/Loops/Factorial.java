import java.util.Scanner;
import java.math.BigInteger;
public class Factorial{
	static BigInteger factorial(int n){
		BigInteger N=BigInteger.valueOf(n);
		BigInteger i=BigInteger.valueOf(2);
		BigInteger fact=BigInteger.ONE;
		while(i.compareTo(N)<=0){
		  fact=fact.multiply(i);
		i=i.add(BigInteger.ONE);
		}
	  return fact;
	}
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a value:");
		int n=sc.nextInt();
		System.out.println("Factorial of "+n+" is:"+factorial(n));
		
	}
}