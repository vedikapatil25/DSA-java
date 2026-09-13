public class Difference {
    public static void main(String[] args) {
        int arr[] = {65, 78 ,  42, 11, 20};
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for(int i = 0; i<arr.length; i++){
            if(arr[i] > largest){
                largest = arr[i];
            }
            if(arr[i] < smallest){
                smallest = arr[i];
            } 

        }
        int diff = largest-smallest;
        System.out.println("Difference is :" + diff);

    }
}
