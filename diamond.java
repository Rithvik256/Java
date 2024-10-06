public class diamond {
    public static void main(String[] args){
        int n=4;
        int i=0,j=0;
        for(i=0;i<n;i++){
            for(j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
            for(j=0;j<=2*i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(i=n-1;i>=0;i--){
            for(j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
            for(j=0;j<=2*i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
