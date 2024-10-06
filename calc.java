import java.util.*;
public class calc {
    public static void main(String[] args){
        Scanner in= new Scanner(System.in);
        int a=in.nextInt();
        int b=in.nextInt();
        char oper=in.next().charAt(0);
        switch(oper){
            case '+': System.out.println(a+b);
            break;
            case '-': System.out.println(a-b);
            break;
            case '*': System.out.println(a*b);
            break;
            case '/': System.out.println(a/b);
            break;
            case '%': System.out.println(a%b);
            break;

        }
        
        
    }
}