
public class SumofEven {
    public static void main(String[] args) {
        int arr[] = {66, 85 , 24 , 12 , 90};
        int sum = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] % 2 == 0){
                sum += arr[i];
            }
        }
        System.out.println("Sum of Even numbers is :" + sum);
    }
}
