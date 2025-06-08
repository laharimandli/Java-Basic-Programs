import java.util.Scanner;
class Average{
    public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n value:");
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
		int s=0,avg=0,c=0;
		for(int i=0;i<n;i++)
		{
		    s+=arr[i];
            c++;			
		}
		avg=s/c;
		System.out.println("\nAverage of Array:"+avg);
	}
}