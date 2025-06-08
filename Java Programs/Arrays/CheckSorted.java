import java.util.Scanner;
class CheckSorted{
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
		boolean sorted=true;
		for(int i=0;i<n;i++){
		        if(arr[i]>arr[i+1])
				{
				  sorted=false;
				  break;
				}
			    
		}
		if(sorted)
		   System.out.println("\nArray is Sorted");
	    else
		   System.out.println("\nArray is not Sorted");
		}
		 
}