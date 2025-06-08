import java.util.*;
class CheckPrime{
     public static void main(String args[]){
		 Scanner sc=new Scanner(System.in);
		 int n=sc.nextInt();
		 int c=0;
		 for(int i=1;i<n;i++){
			 if(n%i==0)
				 c=c+1;
		 }
		 if(c==1)System.out.println(n+" is Prime number!");
		 else System.out.println(n+" is not Prime number!");
	 }
}