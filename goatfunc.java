import java.util.*;
public class goatfunc {
    public static int GoatFunc(int a,int b){
        if(a>b){
            return a;
        }
        else{
            return b;
        }
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int x=in.nextInt();
        int y=in.nextInt();
        int goat=GoatFunc(x,y);
        System.out.println("The greater number among the two numbers is "+goat);
    }
}
