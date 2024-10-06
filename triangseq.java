import java.util.Scanner;
public class triangseq {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int[] seq=new int[n];
        seq[0]=1;
        System.out.print(seq[0]+" ");
        int i;
        for(i=1;i<n;i++){
            seq[i]=((i+1)*(i+1)-seq[i-1]);
            System.out.print(seq[i]+" ");
        }
    }
}
