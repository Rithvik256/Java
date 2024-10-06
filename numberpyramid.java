public class numberpyramid {
    public static void main(String[] args){
        int n=5;
        int i=0,j=0;
        for(i=0;i<n;i++){
            for(j=0;j<=n-1-i;j++){
                System.out.print(" ");
            }
            for(j=0;j<=i;j++){
                System.out.print((i+1)+" ");
            }
            System.out.println();
        }
    }
}
