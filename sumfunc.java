import java.util.*;
public class sumfunc {
    public static void sumtwo(int a,int b){
        int sum=a+b;
        System.out.println(sum);
        return;
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int a=in.nextInt();
        int b=in.nextInt();
        sumtwo(a,b);
    }
}
