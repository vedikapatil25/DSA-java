public class GreaterThanFifty {
    public static void main(String[] args) {
        int arr[] = {46 , 12 , 38 , 79, 54};
        int count = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] > 50) {
                count++;
            }
        }
        System.out.println("There are " + count + " Elements greater than 50");
    }
}
