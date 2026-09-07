public class SmallestElementInArray {

    public static void main(String[] args) {

        int arr[] = {25, 75, 24, 98, 60};

        int min = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] < min) {
                min = arr[i];
            }
        }

        System.out.println("Smallest element: " + min);
    }
}