public class counttrue {
    public static void main(String[] args){
        int count=0;
        int i=0;
        boolean[] arr={false,false,false,false};
        for(i=0;i<arr.length;i++){
            if(arr[i]==true){
                count++;
                continue;
            }
        }
        System.out.println(count);
    }
}
