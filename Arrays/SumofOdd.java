public class SumofOdd {
    public static void main(String[] args) {
        int arr[] = {24, 68 , 19, 76 , 51 };
        int sum = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] % 2 != 0){
                sum += arr[i];
            }
        }
        System.out.println("Sum of odd numbers is :" + sum);
    }
}
