import java.util.*;
public class soildrhombus {
 public static void main(String[] args){
    Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    int i=0,j=0;
    for(i=0;i<n;i++){
        for(j=0;j<=n-i-1;j++){
            System.out.print(" ");
        }
        for(j=0;j<=5;j++){
            System.out.print("*");
        }
        System.out.println();
    }
 }
}