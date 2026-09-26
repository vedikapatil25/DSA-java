import java.util.HashSet;

public class FirstNonrepeatingElement {
    public static void main(String args[]){
        int arr[] = {45 , 12 , 45 , 78 , 48 , 78};
        // HashSet<Integer> set = new HashSet<>();
        for(int i=0; i<arr.length; i++){
            int count = 0;
           for(int j=0; j<arr.length;j++){
            if(arr[i] == arr[j]){
                count++;
            }
            
            
           }
           if(count == 1){
            System.out.println("Found a First Non-Repeating element: " + arr[i]);
           return ;
        }


        }
    }
}
