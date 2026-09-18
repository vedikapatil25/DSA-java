public class SecondSmallestElement {
    public static void main(String[] args) {
        int arr[] = {42 , 67 , 12 , 89 ,56};
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;
        for(int i=0; i<arr.length; i++){
            if(arr[i] < smallest){
                secondSmallest = smallest;
                smallest = arr[i];
            }
            else if(arr[i] < secondSmallest && arr[i] != smallest){
                secondSmallest = arr[i];
            }
        }
        System.out.println("Smallest number is :" + smallest + " Second Smallest number is :" + secondSmallest);

    }
}
