import java.util.Scanner;
class CountFrequency{
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
		boolean visited[]=new boolean[n];
		for(int i=0;i<n;i++)
		{
			if(visited[i]==true)continue;
		    int c=1;
			for(int j=i+1;j<n;j++)
			{
			  if(arr[i]==arr[j])
			  {
			   c++;
			   visited[i]=true;
			  }
			}
			System.out.println("\nFrequency of "+arr[i]+" is:"+c);
		}
	
		
		
	}
}