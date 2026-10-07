package Basics;

public class LinearSearch {
    public static void main(String[] args) {
        int arr[] = {24, 76 , 18 , 46 , 98 ,88};
        int target = 88;
        for(int i=0; i<arr.length; i++){
            if(arr[i] == target){
                System.out.println("Target value is found at index :"+ i);
            }
        }
    }
}
