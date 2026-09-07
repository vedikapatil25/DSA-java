public class LargestElementInArray {

    public static void main(String[] args) {

        int arr[] = {25, 75, 24, 88, 60};

        int max = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.println("Largest element: " + max);
    }
}