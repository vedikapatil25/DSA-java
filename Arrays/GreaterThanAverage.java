public class GreaterThanAverage {
    public static void main(String[] args) {
        int arr[] = {75, 45,  28 , 19 , 52, 61};
        int sum = 0;
        for(int i=0; i<arr.length;i++){
            sum += arr[i];
        }
        double avg = (double)sum/arr.length;
        int count = 0;
        System.out.println("average is: " + avg);
        for(int i=0; i<arr.length; i++){
            if(arr[i]>avg){
                count++;
            }
        }
        System.out.println("Average count is :" + count);
    }
    
}
