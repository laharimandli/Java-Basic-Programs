import java.util.Scanner;
class CalculateEvenAndOdd{
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
		int e=0,o=0;
		for(int i=0;i<n;i++)
		{
		    if(arr[i]%2==0)
			e++;
			else
			o++;
		}
		System.out.print("\nEven: "+e+" Odd:"+o);
		
	}
}