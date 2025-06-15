import java.util.Arrays;
class RemoveDuplicates{
	public static void main(String args[]){
		int arr[]={10,20,30,40,30,20,40};
		int t[]=new int[arr.length];
		Arrays.sort(arr);
		int j=0;
		for(int i=0;i<arr.length-1;i++){
			if(arr[i]!=arr[i+1]){
				t[j]=arr[i];
				j++;
			}
		}
		t[j]=arr[arr.length-1];
		for(int i=0;i<=j;i++){
			System.out.print(t[i]+" ");
		}
	}

}