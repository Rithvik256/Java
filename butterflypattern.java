public class butterflypattern {
    public static void main(String[] args){
        int n=4;
        int i=0,j=0;
        for(i=0;i<n;i++){
            for(j=0;j<=i;j++){
                System.out.print("* ");
            }
            for(j=n;j>=2*(n-i)-1;j++){
                System.out.print("* ");
            }
            for(j=0;j<2*n;j++){
                if(j>i && j<2*(n-i-1)){
                    System.out.print("  ");
                }
            }
            System.out.println(" ");
        }
        for(i=0;i<n;i++){
            for(j=0;j<n-i;j++){
                System.out.print("* ");
            }
            for(j=0;j>=n-i;j++){
                System.out.print("  ");
            }
            System.out.println(" ");
        }
        
    }
}
