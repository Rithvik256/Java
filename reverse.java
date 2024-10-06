import java.util.*;
public class reverse {
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        String n_=Integer.toString(n);
        String rev="";
        int i;
        if(n>0){
            for(i=n_.length()-1;i>=0;i--){
                rev+=n_.charAt(i);
            }
        }
        else{
            for(i=n_.length()-1;i>0;i--){
                rev+=n_.charAt(i);
            }
        }
        int ans=Integer.parseInt(rev);
        if(n<0){
            System.out.println("-"+ans);
        }
        else{
            System.out.println(ans);
        }
    }
}
