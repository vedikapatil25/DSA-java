public class AverageofEvenandOdd {
    public static void main(String[] args) {
        int arr[] = {44, 65, 82 ,12 , 79};
        int sumEven = 0;
        int sumOdd = 0;
        int oddCount = 0;
        int evenCount = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] % 2 == 0){
                sumEven += arr[i];
                evenCount++;
            }
            else {
                sumOdd += arr[i];
                oddCount++;
            }
        }
        double avgEven = (double)sumEven / evenCount;
        double avgOdd =  (double)sumOdd / oddCount;
        System.out.println("Average of Even elements are :" + avgEven + " and Average of odd elements are :" + avgOdd);
    }
}
