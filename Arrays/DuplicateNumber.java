import java.util.HashSet;

public class DuplicateNumber {

    public static void main(String[] args) {

        int arr[] = {24, 12, 65, 87, 12, 90, 12};
        HashSet<Integer> set = new HashSet<>(); 

        for (int i = 0; i < arr.length; i++) {
                if (set.contains(arr[i])) {
                    System.out.print("Duplicate number: " + arr[i]);
                    break;
                }
                set.add(arr[i]);
        }
    }
}
                                                                                                      