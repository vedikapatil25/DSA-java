public class LargestandSmallestOddElement {
    public static void main(String[] args) {
        int arr[] = {24 , 78 , 91 , 27 , 40};
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for(int i=0; i<arr.length;i++){
            if(arr[i] % 2 != 0 && arr[i] > largest){
                largest = arr[i];

            }
            if(arr[i] % 2 != 0 && arr[i] < smallest){
                smallest = arr[i];
            }
        }
        System.out.println("Largest Odd element is :" + largest);
        System.out.println("Smallest Odd element is :" + smallest);
    }
}
