import java.util.*;
public class patternbox {
    public static void main(String[] args){
        Scanner in= new Scanner(System.in);
        int size=in.nextInt();
        int i,j;
        for(i=0;i<size;i++){
            for(j=0;j<size;j++){
                if(i==0 || i==size-1 || j==0 || j==size-1){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println(" ");
        }
    }
}
