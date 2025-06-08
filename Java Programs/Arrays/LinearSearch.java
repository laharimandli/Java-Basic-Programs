import java.util.Scanner;
class LinearSearch{
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
		System.out.println("\nEnter value to search:");
		int key=sc.nextInt();
		boolean found=false;;
		for(int i=0;i<n;i++)
		{
			if(arr[i]==key){
			   found=true;
			   System.out.println(key+" Found at Index:"+i);
			   break;
			}
		}
		if(!found) System.out.println(key+" not Found!");
		
		
		
	}
}