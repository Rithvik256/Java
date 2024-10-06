import java.util.*;
public class circum {
    public static double CircumFunc(double r){
        double pi=3.14;
        double circum=2*pi*r;
        return circum;
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        double rad=in.nextDouble();
        double peri=CircumFunc(rad);
        System.out.println("The circumference of the circle with a radius of "+rad+" is "+peri);
    }
}
