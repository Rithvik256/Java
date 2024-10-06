public class arrayprog {
    public static void main(String[] args){
        int[] arr1={1,3,4,7};
        int max=0;
        int min=0;
        for(int i=0;i<arr1.length;i++){
            max=arr1[0];
            min=arr1[0];
            for(int j=i+1;j<arr1.length;j++){
                if(max<arr1[j]){
                    max=arr1[j];
                }
                if(min>arr1[j]){
                    min=arr1[j];
                }
            }
        }
        System.out.println(min);
        System.out.println(max);
    }
}
