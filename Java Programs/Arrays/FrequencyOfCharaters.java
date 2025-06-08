import java.util.Scanner;
class FrequencyOfCharaters{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String:");
		String str=sc.nextLine();
		int n=str.length();
		boolean visited[]=new boolean[n];
		for(int i=0;i<n;i++){
		
				if(visited[i]==true)
					continue;
				int count=1;
				for(int j=i+1;j<n;j++){
				 if(str.charAt(i)==str.charAt(j)){
					count++;
					visited[i]=true;
				}
			}
			System.out.println("Count Character "+str.charAt(i)+" is:"+count);
		}
	}
		
}