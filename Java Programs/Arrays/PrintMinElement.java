class PrintMinElement{
    public static void main(String args[]){
		int arr[]={10,38,63,53,75,8};
		for(int i=0;i<arr.length;i++){
		System.out.print(arr[i]+" ");
	    }   
		  int min=arr[0];
		for(int i=1;i<arr.length;i++)
		{   
		   if(arr[i]<min)
		     min=arr[i];
			
		}
		System.out.println("Min Element is:"+min);
	}
}