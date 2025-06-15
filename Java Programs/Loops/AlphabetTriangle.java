class AlphabetTriangle{
    public static void main(String[] args) {
       int n=5;
       for(int i=0;i<n;i++){
          for(int j=0;j<=i;j++){
              char c=(char)('A'+i);
              System.out.print(c+" ");
          }
           System.out.println();
       }
    }
}
