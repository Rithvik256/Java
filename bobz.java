import java.util.*;
public class bobz {
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        long be=in.nextLong();
        int n=in.nextInt();
        long[] arr=new long[n];
        int i;
        for(i=0;i<n;i++){
            arr[i]=in.nextLong();
        }
        long post=be;
        for(i=0;i<n;i++){
            long ded=(arr[i]%2)+(arr[i]/2);
            post-=ded;
        }
        System.out.println(post);
        if(post>0){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}
