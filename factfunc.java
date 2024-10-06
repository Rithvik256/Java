import java.util.*;
public class factfunc {
    public static int FactCalc(int x){
        int prod=1;
        while(x!=0){
            prod*=x;
            x--;
        }
        return prod;
    }
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        int a=in.nextInt();
        int fact=FactCalc(a);
        System.out.println("The factorial of "+a+" is "+fact);
    }
}
