public class SecondSmallest {

    public static void main(String[] args) {

        int arr[] = {25, 75, 44, 98, 80};

        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] < smallest) {
                secondSmallest = smallest;
                smallest = arr[i];
            }
            else if(arr[i] != smallest && arr[i] < secondSmallest){
                secondSmallest = arr[i];
            }
        }

        System.out.println("Smallest element: " + smallest);
        System.out.println("Second Smallest element: " + secondSmallest);
    }
}