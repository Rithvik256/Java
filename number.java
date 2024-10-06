import java.util.*;
public class number {
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        String inp=in.nextLine();
        int i;
        int s=inp.length();
        String numb="";
        for(i=0;i<s;i++){
            if(inp.charAt(i)>=97&&inp.charAt(i)<=122){
                numb=numb;
            }
            else{
                numb+=inp.charAt(i);
            }
        }
        System.out.println(numb);
        int numb_=Integer.parseInt(numb);
        System.out.println(numb_);
        
    }
}
