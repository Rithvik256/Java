import java.util.*;
public class supermark {
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int pro=1;
        int tem=n;
        int rem;
        while(n!=0){
            rem=n%10;
            pro*=rem;
            n/=10;
        }
        System.out.println(pro);
    }
}
