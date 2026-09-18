public class SecondLargestElement {
    public static void main(String[] args) {
        int arr[] = {42 , 67 , 12 , 89 ,56};
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            if(arr[i] > largest){
                secondLargest = largest;
                largest = arr[i];
            }
            else if(arr[i] > secondLargest && arr[i] != largest){
                secondLargest = arr[i];
            }
        }
        System.out.println("largest number is :" + largest + " Second largest number is :" + secondLargest);

    }
}
