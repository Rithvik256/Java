import java.util.Scanner;
public class Distanceprob {
    static int Distance(int a_x, int a_y, int b_x, int b_y){
        int dist_a=(a_x*a_x)+(a_y*a_y);
        int dist_b=(b_x*b_x)+(b_y*b_y);
        if(dist_a>dist_b){
            return dist_b;
        }
        else{
            return dist_a;
        }
    }
    public static void main(String args[]){
        Scanner in= new Scanner(System.in);
        int a_x=in.nextInt();
        int a_y=in.nextInt();
        int b_x=in.nextInt();
        int b_y=in.nextInt();
        System.out.println(Distance(a_x,a_y,b_x,b_y));
    }
}
