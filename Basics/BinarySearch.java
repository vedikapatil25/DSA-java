package Basics;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int arr[] = {24 , 98 , 65 , 12 , 90, 88};
        Arrays.sort(arr);
        int target = 88;
        int i  = 0;
        int j = arr.length-1;
        while(i<=j){
            int mid = (i+j)/2;
            if(arr[mid] == target){
                System.out.println("Given target value is found at index : " + mid);
                break;
            }
            else if(arr[mid] < target){
                i = mid +1;
            }
            else{
                j = mid - 1;
            }
        }
    }
}
