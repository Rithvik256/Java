import java.util.*;
public class sumofodds {
    public static int sumOfOdds(int x){
        int sum=0;
        for(int i=1;i<=x;i++){
            if(i%2!=0){
                sum+=i;
            }
            else{
                continue;
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        System.out.println("The of odd numbers from 1 to "+n+" is "+sumOfOdds(n));
    }
}
