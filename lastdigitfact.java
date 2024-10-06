import java.util.*;
public class lastdigitfact {
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int i=1;
        int pro=1;
        for(i=1;i<=n;i++){
            pro*=i;
        }
        System.out.println(pro);
        int rem;
        while(pro!=0){
            rem=pro%10;
            pro=pro/10;
            if(rem!=0){
                System.out.println(rem);
                break;
            }
            else{
                continue;
            }
        }
    }
}
