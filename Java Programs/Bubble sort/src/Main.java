public class Main {
    public static void main(String[] args) {

        System.out.println("Bubble Sort:");
        int arr[]={10,30,20,40,25,98};
        int i,j;
        int size=arr.length;
        System.out.println("Before Sorting:");
        for(i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }
        for(i=0;i<size;i++){
            for(j=0;j<size-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int t=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=t;
                }
            }
        }
    System.out.println("\nAfter Sorting:");
        for(i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }

    }
}