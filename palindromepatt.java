public class palindromepatt {
    public static void main(String[] args) {
        int n=5;
        int i=0,j=0;
        for(i=0;i<n;i++){
            for(j=0;j<n;j++){
                if(j<n-i-1){
                    System.out.print("  ");
                }
                else if(j>=n-i-1){
                    System.out.print(n-j+" ");
                }
            }
            for(j=1;j<i+1;j++){
                System.out.print(j+1+" ");
            }
            System.out.println();
        }
    }
}
