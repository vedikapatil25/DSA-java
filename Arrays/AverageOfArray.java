public class AverageOfArray {
    public static void main(String[] args) {
        int arr[] = {74, 84 , 28 , 16 , 66};
        int n = arr.length;
        int sum = 0;
        for(int i=0; i<n; i++){
            sum += arr[i];
        }
        int avg = sum/n;
        System.out.println("Average of all elements is :" + avg);
    }
}
