public class FirstRepeatedElement {
    public static void main(String[] args) {
        int arr[] = {68, 45 , 24 , 68 ,45 ,15 , 90 ,15 };

        for(int i = 0; i < arr.length; i++){
            for(int j=i+1; j<arr.length;j++){
                if(arr[i] == arr[j]){
                   
                    System.out.println("found a first repeated element:" + arr[i]);
                    return;
                }
            }
        }
    }
}
