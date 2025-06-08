import java.util.Scanner;
class PrintSumOfAllElements{
    public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n value");
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
		System.out.println("Array Elemets are:");
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]+" ");
		}
		int s=0;
		for(int i=0;i<n;i++)
		{
		    s+=arr[i];	
		}
		System.out.print("Sum of All Elements: "+s);
		
	}
}