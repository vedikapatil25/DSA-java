public class CountNumberofZeroes {
    public static void main(String[] args) {
        int arr[] = {0 , 48 , 12 , 0 , 98};
        int count = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] == 0){
                count++;
            }
        }
        System.out.println("Number of zeroes are :" + count);
    }
}
