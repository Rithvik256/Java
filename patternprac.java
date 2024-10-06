import java.util.*;
public class patternprac {
    public static void main(String[] args){
        Scanner in= new Scanner(System.in);
        int n=in.nextInt();
        int i,j,k=1;
        for(i=0;i<n;i++){
            for(j=0;j<n;j++){
                if(j<=i){
                    if((i+j)%2==0){
                        System.out.print("1 ");
                    }
                    else{
                        System.out.print("0 ");
                    }
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println(" ");
        }
    }
}
