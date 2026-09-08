public class SumofArray {
    public static void main(String[] args) {
        int arr[] = {51 , 86 , 77, 24 , 12};
        int sum = 0;
        for(int i=0; i<arr.length; i++){
            sum += arr[i];
        }
        System.out.println("Sum of an Array is:" + sum);
    }
}
