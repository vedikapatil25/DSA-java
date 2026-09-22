public class CheckSortedorNotsorted {
    public static void main(String[] args) {
        int arr[] = {22, 75 , 89 , 91 , 92 };
        boolean isSorted = true;
        for(int i = 1; i<arr.length; i++){
            if(arr[i] < arr[i-1]){
                isSorted = false;
            }
        }
        if(isSorted){
            System.out.println("given array is Sorted");
        }
        else{
            System.out.print("given array is not sorted");
        }
    }
}
