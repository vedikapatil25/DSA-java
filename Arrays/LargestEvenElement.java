public class LargestEvenElement {
    public static void main(String[] args) {
        int arr[] = {28 , 46 , 12 , 90 , 54};
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for(int i=0; i<arr.length; i++){
            if(arr[i] % 2 == 0 && arr[i] > largest){
                largest = arr[i];             
            }
            if(arr[i] % 2 == 0 && arr[i] < smallest){
                smallest = arr[i];
            }
        }
        System.out.println("Largest even element is :" + largest);
        System.out.println("Smallest even element is :" + smallest);
    }

}
