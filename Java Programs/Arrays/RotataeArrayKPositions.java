class RotateArrayKPositions{
	int arr[]={10,20,30,40,50};
	int n=arr.length;
	k=3;
	for(int i=0;i<3;i++){
		int t=n-1;
		for(int j=0;j<n;j++){
			arr[i+1]=arr[i];
		}
		arr[0]=t;
		
	}
	for(int i=0;i<n;i++){
		System.out.print(arr[i]+" ");
	}
}