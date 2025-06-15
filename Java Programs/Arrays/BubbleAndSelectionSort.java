import java.util.Scanner;
class BubbleAndSelectionSort{
	public static void bubbleSort(int arr[]){
		int n=arr.length;
		for(int i=0;i<n;i++){
			for(int j=0;j<n-i-1;j++){
		    if(arr[j]>arr[j+1]){
				int t=arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=t;
			}
			}
		}
		System.out.println("Sorted Elements Using Bubble Sort:");
		for(int i:arr){
			System.out.print(i+" ");
		}
		
	}
	public static void selectionSort(int arr[]){
	   int n=arr.length;
       for(int i=0;i<n-1;i++){
		   int minIndex=i;
		  for(int j=i+1;j<n;j++){
			  if(arr[minIndex]>arr[j]){
				  minIndex=arr[j];
			  }
		  }
		  int t=arr[minIndex];
			  arr[minIndex]=arr[i];
			  arr[i]=t;
		   
		}
       System.out.println("\nSorted Elements Using Selection Sort:");
		for(int i:arr){
			System.out.print(i+" ");
		}
			  	   
	}
	
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n value:");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter Array Elements:");
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
	   bubbleSort(arr);
	    selectionSort(arr);
		
	}
}