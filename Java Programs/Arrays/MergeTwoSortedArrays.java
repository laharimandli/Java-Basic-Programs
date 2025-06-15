import java.util.Scanner;
class MergeTwoSortedArrays{
	public static int[] merge(int arr1[],int arr2[]){
		int n1=arr1.length;
		int n2=arr2.length;
		int arr[]=new int[n1+n2];
		int i=0,j=0,k=0;
		while(i<n1&& j<n2){
			if(arr1[i]<=arr2[j]){
				arr[k++]=arr1[i++];
			}
			else{
				arr[k++]=arr2[j++];
			}
		}
		while(i<n1)
			arr[k++]=arr1[i++];
		while(j<n2)
			arr[k++]=arr2[j++];
		return arr;
	}
	
	
	public static void readArray(int arr[],int size){
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<size;i++){
			arr[i]=sc.nextInt();
		}
		
	}
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter sizes of array1 and array2");
		int arr1size=sc.nextInt();
		int arr2size=sc.nextInt();
		int arr1[]=new int[arr1size];
		int arr2[]=new int[arr2size];
		readArray(arr1,arr1size);
		readArray(arr2,arr2size);
		int[] mergedArray=merge(arr1,arr2);
		System.out.println("Merged Sorted Array:");
        for (int num : mergedArray) {
            System.out.print(num + " ");
        }
		
		
	}
}