import java.util.HashSet;

public class DuplicateNumber {
    public static void main(String[] args) {
        int arr[] = {64 , 14 , 78 , 14 , 89 ,56 , 64 ,71};
        //using neste3d loop time complexty : O(n^2)
        // for(int i= 0; i<arr.length;i++){
        //     for(int j = i+1; j<arr.length; j++){
        //         if(arr[i] == arr[j]){
        //             System.out.println("Found a duplicate number :" + arr[i]);
        //         }

        //     }
        // }
        //using HashSet time complexity : O(n)
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0; i < arr.length ; i++){
            if (set . contains(arr[i])){
                System.out.println("Duplicate number is : " + arr[i]);
            }
            else{
                set.add(arr[i]);
            }
        }
    }
}
