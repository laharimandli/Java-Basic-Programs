class PrintMaxElement{
    public static void main(String args[]){
		int arr[]={10,38,63,53,75,8};
		for(int i=0;i<arr.length;i++){
		System.out.print(arr[i]+" ");
	    }   
		  int max=arr[0];
		for(int i=1;i<arr.length;i++)
		{   
		   if(arr[i]>max)
		     max=arr[i];
			
		}
		System.out.println("Max Element is:"+max);
	}
}