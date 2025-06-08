import java.util.Scanner;
class PrintReverseArray{
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
		
		System.out.println("\nArray Elemets in Reverse:");
		for(int i=n-1;i>=0;i--)
		{
			System.out.print(arr[i]+" ");
		}
		
		
	}
}