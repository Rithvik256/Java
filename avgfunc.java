import java.util.*;
public class avgfunc {
    public static int avgCalc(int a,int b,int c){
        int sum=a+b+c;
        int avg=sum/3;
        return avg;
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int x=in.nextInt();
        int y=in.nextInt();
        int z=in.nextInt();
        int avg=avgCalc(x,y,z);
        System.out.println("The average of the numbers "+x+", "+y+" and "+z+" is "+avg);
    }
}
