public class LessThanFifty {
    public static void main(String[] args) {
        int arr[] = {46 , 18 , -59 , 24 , -11};
        int positiveCount = 0;
        int negativeCount = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] < 0){
                negativeCount++;
            }
            else{
                positiveCount++;
            }
        }
        System.out.println("There are " + positiveCount + " positive elements and " + negativeCount + " negative elements");
    }
}
