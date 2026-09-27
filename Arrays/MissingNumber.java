

public class MissingNumber {
    public static void main(String[] args) {
        int arr[] = {1 , 4 , 2 , 5 ,6};
        int actualSum = 0;
        int n = 6;
        int expectedSum = n * (n+1)/2;
        for(int i = 0; i<arr.length ;i++){
            actualSum += arr[i];
        }
        int missing = expectedSum - actualSum;
        System.out.println("Missing number is :" + missing);
    }
}
