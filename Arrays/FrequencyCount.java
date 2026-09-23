public class FrequencyCount {
    public static void main(String[] args) {
        int arr[] = {45 , 64 , 78 , 42  , 90 , 42 , 64};
        for(int i=0; i<arr.length;i++){
            int count = 0;
            for(int j=0; j<arr.length;j++){
                if(arr[i] == arr[j]){
                    count++;
                }
            }
            System.out.println("count of " +arr[i]+ " is " + count);
        }
    }
}
