import java.util.*;
public class functions1 {
    public static void printMyName(String name){
        System.out.println(name);
        return;
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String name=in.nextLine();
        printMyName(name);
    }
}
