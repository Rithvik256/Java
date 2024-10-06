import java.util.*;
public class chocfact {
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int[] arr=new int[n];
        int i;
        for(i=0;i<n;i++){
            arr[i]=in.nextInt();
        }
        int count=0;
        for(i=0;i<n;i++){
            if(arr[i]==0){
                count++;
            }
            else{
                System.out.print(arr[i]+" ");
            }
        }
        for(i=0;i<count;i++){
            System.out.print(0+" ");
        }
    }
}
