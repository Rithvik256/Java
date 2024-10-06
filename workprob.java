import java.util.Scanner;
public class workprob {
    static int Workleft(int work, int f1, int d1, int f2, int d2){
        int work_com=f1*d1+f2*d2;
        int work_left=work-work_com;
        return work_left;
    }
    public static void main(String args[]){
    Scanner in= new Scanner(System.in);
    int work=in.nextInt();
    int f1=in.nextInt();
    int d1=in.nextInt();
    int f2=in.nextInt();
    int d2=in.nextInt();
    System.out.println(Workleft(work, f1,d1,f2,d2));
}
}