public class PairWithGivenSum {
    public static void main(String[] args) {
        int arr[] = {1 , 3 , 6 , 5 , 8};
        int target = 10;
        int i = 0;
        int j = arr.length-1;
        while(i<j){
            int sum = arr[i] + arr[j];
            if(sum == target){
                System.out.println("found a pair with given sum : " + arr[i] + " and " + arr[j]);
                return ;
            }
            else if(sum < target){
                i++;
            }
            else if(sum>target){
                j--;
            }
        }
            System.out.println("No pair found");
        
    }
}
