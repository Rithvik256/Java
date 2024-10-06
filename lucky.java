import java.util.*;
public class lucky {
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        String str=in.next();
        String name="";
        int i;
        for(i=0;i<str.length();i++){
            if((str.charAt(i)>=65 && str.charAt(i)<=90)||(str.charAt(i)>=97 && str.charAt(i)<=122)){
                name+=str.charAt(i);
            }
        }
        System.out.println(name);
        int sum=0;
        for(i=0;i<name.length();i++){
            if(name.charAt(i)>=97){
                sum+=name.charAt(i)-96;
            }
            else{
                sum+=name.charAt(i)-64;
            }
        }
        System.out.println(sum);
        int sum_=0;
        int rem=0;
        int count=name.length();
        int a=0;
        while(sum!=0){
            rem=sum%10;
            sum_+=rem;
            sum=sum/10;
            a++;
            if((a==count-1)&&(sum_>9)){
                sum=sum_;
                sum_=0;
            }
        }
        System.out.println(sum_);
    }
}
