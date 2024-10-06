import java.util.*;
public class palindromeinrange {
    public static void main(String[] args) {
	    Scanner in=new Scanner(System.in);
	    int range=in.nextInt();
	    int i=1;
	    int count=0;
	    int temp;
	    int rem;
	    int sum;
	    while(i<=range){
	        temp=i;
	        sum=0;
	        if(i<=9){
	            count++;
	        }
	        else{
	            while(temp!=0){
	                rem=temp%10;
	                temp/=10;
	                sum=10*sum+rem;
	                if(sum==i){
	                    count++;
	                }
	            }
	        }
	        i++;
	    }
	    System.out.println(count);
	}
}
