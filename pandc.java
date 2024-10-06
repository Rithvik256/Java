import java.util.*;
public class pandc {
    public static int factorial(int n){
        int i=1;
        int fact=1;
        for(i=1;i<=n;i++){
            fact*=i;
        }
        return fact;
    }
    public static int countways(int n, int m, int p, int e){
        int choosepencils=factorial(n)/(factorial(p)*factorial(n-p));
        int chooseerasers=factorial(m)/(factorial(e)*factorial(m-e));
        return choosepencils*chooseerasers;
    }
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int m=in.nextInt();
        int p=in.nextInt();
        int e=in.nextInt();
        int res=countways(n,m,p,e);
    }
}
