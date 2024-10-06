import java.util.*;
public class voteelig {
    public static void EligForVote(int age){
        if(age>=18){
            System.out.println("Eligible to vote");
        }
        else{
            System.out.println("Not eligible to vote");
        }
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int age=in.nextInt();
        EligForVote(age);
    }
}
