public class pyramid {
    public static void main(String[] args){
        int n=5;
        int i=0,j=0;
        for(i=0;i<n;i++){
            for(j=0;j<n;j++){
                if(j==n-i){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }

            }
            System.out.println(" ");
        }
    }
}
